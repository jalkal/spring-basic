package domain;

public class Customer {

    public Customer(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;

    @Override
    public String toString() {
        return lastname + ", " + name;
    }
}
