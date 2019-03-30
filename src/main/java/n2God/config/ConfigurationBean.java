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



@Configuration
@Import(AddressConfig.class)
public class ConfigurationBean {

    @Autowired
    @Qualifier("default")
    private Address address;


    @Bean
    public Employee person(){
        Director d = new Director();
        d.setAddress(address);
        return d;
    }

    @Bean //po tej nazwie szuka bina
    public HelloWorld hello(){
        return new HelloWorld("Welcome ...");
    }

}
