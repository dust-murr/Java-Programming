package testcustomer;
public class TestCustomer {
    
    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        myCustomer.setFirstName("Fred");
        myCustomer.setLastName("Jones");
        myCustomer.setStreetAddress("15 Pine Ave");
        myCustomer.setCity("Lincroft");
        myCustomer.setState("NJ");
        myCustomer.setZip("07738");
        System.out.println(myCustomer.getFormattedName() + "\n" + myCustomer.getFormattedAddress());
    }
}
class Customer {
    private String firstName;
    private String lastName; 
    private String streetAddress; 
    private String city; 
    private String state;
    private String zip;
    
    Customer() {
        
    }
    
    Customer(String firstName, String lastName, String streetAddress, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getStreetAddress() {
        return this.streetAddress;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public String getFormattedName() {
        return this.firstName + " " + this.lastName;
    }
    public String getFormattedAddress() {
        return this.streetAddress + "\n" + this.city + ", " + this.state + " " + this.zip;
    }
}
