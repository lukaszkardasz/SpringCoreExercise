package n2God.employee;

public class Address {

    String city;
    private int homeNumber;

    public Address(String city, int homeNumber) {
        this.city = city;
        this.homeNumber = homeNumber;
    }

    public Address(){

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }
}
