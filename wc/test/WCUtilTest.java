import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

public class WCUtilTest{
	@Test
	public void WC_can_saperate_options_from_args(){
		WCUtil util = new WCUtil();
		String[] args = {"-l", "-w", "-w", "-c", "fileName"};

		String[] expected = {"-l", "-w", "-c"};
		
		assertTrue(Arrays.deepEquals(expected, util.getOptions(args)));
	}
}