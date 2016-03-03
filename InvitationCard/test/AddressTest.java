import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void test_Address_can_give_full_address() throws Exception {
        Address add = new Address("Oman", "Janak","Puri");
        assertEquals("City: Oman, State: Janak, Country: Puri", add.getFullAddress());
    }
}