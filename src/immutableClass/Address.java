package immutableClass;

public class Address {

    private String street;
    private int zipCode;
    private String state;
    private String Country;

//    public Address (String street, Long zipCode, String state, String country) {
//        this.street = street;
//        this.zipCode = zipCode;
//        this.state = state;
//        Country = country;
//    }

    public Address () {

    }

    public String getStreet () {
        return street;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    public int getZipCode () {
        return zipCode;
    }

    public void setZipCode (int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState () {
        return state;
    }

    public void setState (String state) {
        this.state = state;
    }

    public String getCountry () {
        return Country;
    }

    public void setCountry (String country) {
        Country = country;
    }
}
