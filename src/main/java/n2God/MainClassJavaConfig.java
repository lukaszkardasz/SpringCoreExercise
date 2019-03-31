package n2God;

import n2God.config.ConfigurationBean;
import n2God.employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassJavaConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        HelloWorld hw = context.getBean("hello", HelloWorld.class);
        hw.sayHello();

        Employee e = context.getBean("person", Employee.class);
        e.printAdress();

        e = context.getBean("person2", Employee.class);
        e.printAdress();
    }
}
