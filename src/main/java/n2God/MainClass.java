package n2God;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {

    static SimpleClassInfo info;

    public static void main(String[] args) {
        info = new SimpleClassInfo(1, "Pierwszy");
        System.out.println(info);
    }
}
