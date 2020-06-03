#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.connector.web.dummy;

import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import com.github.tomakehurst.wiremock.junit.WireMockClassRule;
import it.gov.pagopa.bpd.common.connector.BaseFeignRestClientTest;
import ${package}.${msPackageName}.connector.web.dummy.config.DummyRestClientConfig;
import ${package}.${msPackageName}.connector.web.dummy.model.DummyModel;
import lombok.SneakyThrows;
import org.junit.ClassRule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.support.TestPropertySourceUtils;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@TestPropertySource(
        locations = "classpath:config/dummy/rest-client.properties",
        properties = "spring.application.name=${appType}-ms-enrollment-integration-rest")
@ContextConfiguration(initializers = DummyRestClientTest.RandomPortInitializer.class,
        classes = DummyRestClientConfig.class)
public class DummyRestClientTest extends BaseFeignRestClientTest {//FIXME: remove me (created as archetype test)

    @ClassRule
    public static WireMockClassRule wireMockRule = new WireMockClassRule(wireMockConfig()
            .dynamicPort()
            .usingFilesUnderClasspath("stubs/dummy")
            .extensions(new ResponseTemplateTransformer(false)) //TODO: leave it only if used inside stubs
    );

    public static class RandomPortInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
        @SneakyThrows
        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
            TestPropertySourceUtils
                    .addInlinedPropertiesToEnvironment(applicationContext,
                            String.format("rest-client.dummy.base-url=http://%s:%d/dummy-endpoint",
                                    wireMockRule.getOptions().bindAddress(),
                                    wireMockRule.port())
                    );
        }
    }

    @Autowired
    private DummyRestClient restClient;

    @Test
    public void dummyRestServiceMethod() {
        final String id = "id";

        final DummyModel actualResponse = restClient.dummyRestServiceMethod(id);

        assertNotNull(actualResponse);
        assertEquals(id, actualResponse.getId());
    }

}
