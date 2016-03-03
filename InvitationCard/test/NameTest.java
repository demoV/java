import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void testName() throws Exception {
        Name n = new Name("My","Name");
        assertEquals("My Name", n.fullName());
    }
}