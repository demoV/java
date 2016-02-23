import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

public class WCTest{
	@Test
	public void WC_can_give_number_of_char_of_the_given_String(){
		String text = "This is my first word count";
		WC wc = new WC();
		assertEquals(27, wc.numberOfCharector(text));
	}
	@Test
	public void WC_can_give_number_of_line_of_the_given_String(){
		String text = "This is my first word count";
		WC wc = new WC();
		assertEquals(0, wc.numberOfLines(text));
	}
	@Test
	public void WC_can_give_number_of_lines_of_the_given_String(){
		String text = "This is my first word count\r\nNow wc is working";
		WC wc = new WC();
		assertEquals(1, wc.numberOfLines(text));
	}
	@Test
	public void WC_can_give_number_of_words_of_the_given_line_of_string(){
		String text = "This is my first word count";
		WC wc = new WC();
		assertEquals(6, wc.numberOfWords(text));
	}
	@Test
	public void WC_can_give_number_of_words_of_the_given_String(){
		String text = "This is my first word count\r\nNow wc is working";
		WC wc = new WC();
		assertEquals(10, wc.numberOfWords(text));
	}
	@Test
	public void WC_can_give_number_of_lines_of_the_empty_String(){
		String text = "";
		WC wc = new WC();
		assertEquals(0, wc.numberOfLines(text));
	}
	@Test
	public void WC_can_give_number_of_words_of_the_empty_String(){
		String text = "";
		WC wc = new WC();
		assertEquals(0, wc.numberOfWords(text));
	}
	@Test
	public void WC_can_give_allResult_of_the_String(){
		String text = "This is my first word count\r\nNow wc is working";
		WC wc = new WC();
		int[] expected = {1, 10, 46};
		assertEquals(expected[0], wc.getAllResult(text)[0]);
	}
	// @Test
	// public void WC_can_filter_allResult_of_the_String(){
	// 	String text = "This is my first word count\r\nNow wc is working";
	// 	WC wc = new WC();
	// 	int[] expected = {1, 10, 46};
	// 	assertEquals(expected[0], wc.getAllResult(text)[0]);
	// }
	// @Test
	// public void WC_can_saperate_options_from_args(){
	// 	WCUtil util = new WCUtil();
	// 	String[] args = {"-l", "-w", "-w", "-c", "fileName"};

	// 	String[] expected = {"-l", "-w", "-c"};
		
	// 	assertTrue(Arrays.deepEquals(expected, util.getOptions(args)));
	// }
}