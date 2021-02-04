package ${package}.${msPackageName}.connector.config;

import eu.sia.meda.connector.jpa.JPAConnectorImpl;
import eu.sia.meda.connector.jpa.config.JPAConnectorConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConditionalOnMissingBean(name = "JPADataSource")
@Configuration
@PropertySource("classpath:config/jpaConnectionConfig.properties")
@EnableJpaRepositories(
        repositoryBaseClass = JPAConnectorImpl.class,
        basePackages = {"it.gov.pagopa.bpd"}
)
public class JpaConfig extends JPAConnectorConfig {
}