package n2God.config;

import n2God.employee.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean(name = "default")
    public Address defaultAddress(){
        Address temp = new Address();
        temp.setCity("Warszawa");
        temp.setHomeNumber(123);
        return temp;
    }

    @Bean (name = "usa")
    public Address UsaAddress(){
        Address temp = new Address();
        temp.setCity("USA");
        temp.setHomeNumber(456);
        return temp;
    }

}
