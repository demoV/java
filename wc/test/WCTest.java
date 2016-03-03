import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
	@Test
	public void getCount_gives_counts_of_a_fileContent() {
		String text = "This is my first word count\r\nNow wc is working";
		WC wc = new WC();
		int[] count = {1, 10, 46};
		Counts expected = new Counts("fileName", count);
		assertEquals(expected, wc.getCounts( new String[0], text, "fileName" ));
	}
	@Test
	public void total_can_give_total_of_counts() {
		WC wc = new WC();
		int[] count1 = {1, 10, 46};
		int[] count2 = {1, 10, 46};
		Counts countObjOfFirstFile = new Counts("file1", count1);
		Counts countObjOfSecondFile = new Counts("file2", count2);

		Counts[] allCounts = {countObjOfFirstFile, countObjOfSecondFile};
		int[] total =  {2, 20, 92};
		Counts expected = new Counts("Total", total);

		assertEquals(expected, wc.total(allCounts));
	}
	
}