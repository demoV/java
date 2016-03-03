
public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.country = country;
        this.state = state;
    }
    public String  getFullAddress() {
        return String.format("City: %s, State: %s, Country: %s", city, state, country);
    }
    public String getCountry() {
        return country;
    }

}
