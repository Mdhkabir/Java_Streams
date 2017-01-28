import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {

		
		File f = new File("C:\\Filewriting\\MyTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		reader.close();

	}

}
