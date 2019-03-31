package n2God.config;

import n2God.HelloWorld;
import n2God.employee.Address;
import n2God.employee.Director;
import n2God.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;


@Configuration
@Import({AddressConfig.class, PersonConfig.class})
public class ConfigurationBean {

    @Autowired
    @Qualifier("default")
    private Address address;

    @Autowired
    @Qualifier("director")
    private Employee person;

    @Bean //po tej nazwie szuka bina
    public HelloWorld hello(){
        return new HelloWorld("Welcome ...");
    }

    @Bean
    @Scope(value = "prototype")
    public Employee person(){
        return person;
    }

    @Bean
    @Scope(value = "prototype")
    public Employee person2(){
        person.printAdress();
        return person;
    }


}
