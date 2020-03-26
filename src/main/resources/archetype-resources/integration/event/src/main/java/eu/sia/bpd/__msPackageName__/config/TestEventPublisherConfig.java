#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package it.gov.pagopa.bpd.${msPackageName}.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/testResponsePublisher.properties")
public class TestEventPublisherConfig {//FIXME: remove me (created as archetype test)
}
