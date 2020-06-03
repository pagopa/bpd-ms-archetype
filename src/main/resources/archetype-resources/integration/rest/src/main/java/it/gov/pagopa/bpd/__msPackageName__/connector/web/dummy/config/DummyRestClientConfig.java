#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.connector.web.dummy.config;

import it.gov.pagopa.bpd.common.connector.config.RestConnectorConfig;
import ${package}.${msPackageName}.connector.web.dummy.DummyRestClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(RestConnectorConfig.class)
@EnableFeignClients(clients = DummyRestClient.class)
@PropertySource("classpath:config/dummy/rest-client.properties")
public class DummyRestClientConfig {//FIXME: remove me (created as archetype test)
}
