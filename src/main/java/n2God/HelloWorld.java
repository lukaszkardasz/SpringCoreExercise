package n2God;

public class HelloWorld {
    private String greet;

    public HelloWorld(){
    }

    public HelloWorld(String greet) {
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    void sayHello(){
        System.out.println("Hello!");
    }
}
