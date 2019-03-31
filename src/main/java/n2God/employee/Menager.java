package n2God.employee;

public class Menager implements Employee {

    private Address address;

    public Menager(Address address) {
        this.address = address;
    }

    public Menager(){

    }

    @Override
    public void printAdress() {
        System.out.println("Director address: " + address.getCity() + " " + address.getHomeNumber());
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }



}
