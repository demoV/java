import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

class FileSystem {
	public String readFile(String fileName) {
		String content;
		try{
			File file = new File(fileName);
			FileReader reader = new FileReader(file);
			int size = (int)file.length();
			char[] buffer = new char[size];
			reader.read(buffer, 0, size);
			content = new String(buffer);
			reader.close();	
		}
		catch(IOException ie){ System.out.println(ie) }
		catch(FileNotFoundException fe){ System.out.println(fe) }
		return content;
	}	
}