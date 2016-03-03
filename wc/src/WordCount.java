import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WordCount{

	private  void print(String counts) throws IOException, FileNotFoundException{
		System.out.println(counts);
	}

	public static void main(String[] args)  throws IOException, FileNotFoundException {
		

		WC wc = new WC();
		FileSystem fileSys = new FileSystem();
		WordCount wordCount = new WordCount();
		WCUtil util = new WCUtil();
		String[] options = util.getOptions(args);
		
	}
}