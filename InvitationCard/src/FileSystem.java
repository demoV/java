import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileSystem {
    public String readFile(String fileName) throws IOException {
        String content;
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        int size = (int)file.length();
        char[] buffer = new char[size];
        reader.read(buffer, 0, size);
        content = new String(buffer);
        reader.close();
        return content;
    }

}