package n2God;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainClass {

    static SimpleClassInfo info;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ziarenka.xml");
        info = context.getBean("simple_1", SimpleClassInfo.class);

        System.out.println(info);
    }
}
