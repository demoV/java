import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    @Test
    public void test_getName_gives_name_with_prefix() throws Exception {
        Guest lp = new Guest(new Name("U","Me"), Gender.Male, "20", new Address("420","Prem Gali","Rupmahal"));
        assertEquals("Mr U Me", lp.getFirstNameFirst());
    }

    @Test
    public void test_getLastNameFirst_gives_last_name_first() throws Exception {
        Guest lp = new Guest(new Name("U","Me"), Gender.Male, "20", new Address("420","Prem Gali","Rupmahal"));
        assertEquals("Mr Me,U", lp.getLastNameFirst());
    }
}