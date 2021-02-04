package ${package}.${msPackageName}.connector.config;

import it.gov.pagopa.bpd.common.connector.jpa.config.BaseJpaConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/jpaConnectionConfig.properties")
public class JpaConfig extends BaseJpaConfig {
}
