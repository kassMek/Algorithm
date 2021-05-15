package immutableClass;

public final class Employee {

    private final String firstName;
    private final String lastName;
    private  final String emailAddress;
    private  final Address address;

    public Employee (String firstName, String lastName, String emailAddress, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getEmailAddress () {
        return emailAddress;
    }

    public Address getAddress () {
        Address clonedAddress= new Address();
        clonedAddress.setZipCode(address.getZipCode());
        clonedAddress.setStreet(address.getStreet());
        clonedAddress.setState(address.getState());
        clonedAddress.setCountry(address.getCountry());
        return clonedAddress;
    }

    public static void main (String[] args) {
        Address myAddress= new Address();
        myAddress.setZipCode(75507);
        myAddress.setStreet("290W Lake Park Road");
        myAddress.setState("Texas");
        myAddress.setCountry("USA");
        Employee emp= new Employee("Kassahun","Assfaw","kassamsay@gmail.com",myAddress);
        System.out.println(emp.getAddress().getState());
        //myAddress.setState("Georgia");
        //System.out.println(emp.getAddress().getState());

        //trying to change the Employee address state to Georgia
        emp.getAddress().setState("Georgia"); //the state name remains to Texas
        System.out.println(emp.getAddress().getState());

    }
}