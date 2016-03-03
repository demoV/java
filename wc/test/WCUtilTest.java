import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WCUtilTest{
	@Test
	public void WCUtil_getOptions_can_saperate_options_from_args(){
		WCUtil util = new WCUtil();
		String[] args = {"-l", "-w", "-w", "-c", "fileName"};

		String[] expected = {"-l", "-w", "-c"};
		
		assertTrue(Arrays.deepEquals(expected, util.getOptions(args)));
	}
	@Test
	public void WCUtil_getOptions_gives_empty_array_if_options_is_not_present(){
		WCUtil util = new WCUtil();
		String[] args = {"fileName"};

		String[] expected = {};
		
		assertTrue(Arrays.deepEquals(expected, util.getOptions(args)));
	}
	@Test
	public void WCUtil_getOptions_does_not_give_option_given_after_file_name(){
		WCUtil util = new WCUtil();
		String[] args = {"-l","fileName","-c"};

		String[] expected = {"-l"};
		
		assertTrue(Arrays.deepEquals(expected, util.getOptions(args)));
	}
	 @Test
	 public void getIllegalOption_filters_illegal_option_from_options() {
	 	WCUtil util = new WCUtil();
	 	String[] args = {"-k","fileName"};

	 	String[] options = util.getOptions(args);
	 	try{
	 		util.getIllegalOption(options);
	 	}
	 	catch(Error e){
	 		 assertEquals(e.getMessage(), "wc: -k illegal option");
	 		System.out.println(e);
	 	}
	 }

	// @Test
	// public void getIllegalOption_gives_empty_string_if_illegal_option_is_not_found() {
	// 	WCUtil util = new WCUtil();
	// 	String[] args = {"-l","fileName"};

	// 	String expected = "";
	// 	String[] options = util.getOptions(args);
	// 	assertEquals(expected, util.getIllegalOption(options));
	// }
	@Test
	public void getAllFiles_gives_fileName() {
		WCUtil util = new WCUtil();
		String[] args = {"-l","fileName"};

		String[] expected = {"fileName"};
		assertTrue(Arrays.deepEquals(expected, util.getAllFiles(args)));
	}

	@Test
	public void getAllFiles_gives_all_fileName_from_args() {
		WCUtil util = new WCUtil();
		String[] args = {"-l","fileName","-i"};

		String[] expected = {"fileName", "-i"};
		assertTrue(Arrays.deepEquals(expected, util.getAllFiles(args)));
	}

	@Test
	public void getAllFiles_gives_empty_array_if_fileName_not_given() {
		WCUtil util = new WCUtil();
		String[] args = {"-l","-fileName","-i"};

		String[] expected = {};
		assertTrue(Arrays.deepEquals(expected, util.getAllFiles(args)));
	}
	@Test
	public void illegalOptionError_gives_error_message_for_illegal_option() {
		WCUtil util = new WCUtil();

		String expected = "wc: -k illegal option";
		assertEquals(expected, util.illegalOptionError("-k"));
	}
	@Test
	public void getPresentationFormate_convet_counts_to_presantable_formate(){
		WCUtil util = new WCUtil();

		String expected = "1\t10\t46\tfile1\n1\t15\t26\tfile2\n";

		int[] count1 = {1, 10, 46};
		int[] count2 = {1, 15, 26};
		Counts countObjOfFirstFile = new Counts("file1", count1);
		Counts countObjOfSecondFile = new Counts("file2", count2);

		Counts[] allCounts = {countObjOfFirstFile, countObjOfSecondFile};

		assertEquals(expected, util.getPresentationFormat(allCounts));
	}

}