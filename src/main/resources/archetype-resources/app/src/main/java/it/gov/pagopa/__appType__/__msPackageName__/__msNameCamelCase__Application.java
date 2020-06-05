#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${msPackageName};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class, SessionAutoConfiguration.class})
@ComponentScan(basePackages = {"eu.sia.meda", "${package}"})
public class ${msNameCamelCase}Application {

	public static void main(String[] args) {
		SpringApplication.run(${msNameCamelCase}Application.class, args);
	}

}
