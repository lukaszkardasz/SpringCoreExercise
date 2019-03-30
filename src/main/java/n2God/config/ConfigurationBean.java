package n2God.config;

import n2God.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {

    @Bean //po tej nazwie szuka bina
    public HelloWorld hello(){
        return new HelloWorld("Welcome ...");
    }

}
