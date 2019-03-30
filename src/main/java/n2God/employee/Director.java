package n2God.employee;

public class Director implements Employee{
    private Address address;

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
