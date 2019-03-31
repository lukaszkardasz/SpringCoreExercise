package n2God.config;


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
public class PersonConfig {


    @Autowired
    @Qualifier("default")
    private Address address;

    @Bean
    @Qualifier("director")
    public Director director(){
        return new Director();
    }
}
