
public class Invitation {
    public String getCardLableWithCountry(Guest guest) {
        return String.format("%s,%s", guest.getFirstNameFirst(), guest.getCountry());
    }

    public String getCardLableLastNameFirst(Guest guest) {
        return String.format("%s,%s", guest.getLastNameFirst(), guest.getCountry());
    }
}
