import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvitationTest {
    @Test
    public void test_getCardLableWithCountry_gives_fullName_and_country_as_lables() throws Exception {
        Invitation invitation = new Invitation();
        Guest lp = new Guest(new Name("U","Me"), Gender.Male, "20", new Address("420","Prem Gali","Rupmahal"));
        assertEquals("Mr U Me,Rupmahal", invitation.getCardLableWithCountry(lp));
    }

    @Test
    public void test_getCardLableLastNameFirst_gives_Last_name_first_as_lable() throws Exception {
        Invitation invitation = new Invitation();
        Guest lp = new Guest(new Name("U","Me"), Gender.Male, "20", new Address("420","Prem Gali","Rupmahal"));
        assertEquals("Mr Me,U,Rupmahal", invitation.getCardLableLastNameFirst(lp));
    }
}