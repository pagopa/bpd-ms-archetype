package ${package}.${msPackageName}.config;

import eu.sia.meda.connector.jpa.config.JPAConnectorConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ConditionalOnMissingBean(name = "JPADataSource")
@Configuration
@PropertySource("classpath:config/${msNameCamelCase}JpaConnectionConfig.properties")
public class ${msNameCamelCase}JpaConfig extends JPAConnectorConfig {
}
