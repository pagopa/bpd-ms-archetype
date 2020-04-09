#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName}.connector.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/${msNameCamelCase}RestConnector.properties")
public class ${msNameCamelCase}RestConnectorConfig {//FIXME: remove me (created as archetype test)
}
