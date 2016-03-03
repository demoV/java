
public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public String lastNameFirst() {
        return String.format("%s,%s", lastName, firstName);
    }
}
