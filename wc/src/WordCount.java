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
		int[] res =  wc.getCounts(options, fileSys.readFile(args[args.length - 1]));
		for (int i = 0; i < res.length ;i++ ) {
			System.out.println(res[i]+ " "+options[0]);
		}
		// wordCount.print(res);
	}
}