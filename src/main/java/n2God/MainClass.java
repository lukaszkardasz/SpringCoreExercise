package n2God;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainClass {

    static SimpleClassInfo info;
    static HelloWorld hello;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ziarenka.xml");
        info = context.getBean("simple_1", SimpleClassInfo.class);
        info = context.getBean("simple_2", SimpleClassInfo.class);
        info = context.getBean("simple_3", SimpleClassInfo.class);
        info = context.getBean("simple_4", SimpleClassInfo.class);
        hello = context.getBean("hello_1", HelloWorld.class);
        hello.sayHello();
        hello = context.getBean("hello_2", HelloWorld.class);
        hello.sayHello();

        System.out.println(info);
    }
}
