import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		// writing inside the fiel

		File f = new File("C:\\Filewriting\\MyTextFile.txt");
		FileWriter fw = new FileWriter(f); // if i write (f,turu)i can add more line.
		BufferedWriter writer = new BufferedWriter(fw);
		
		// writing inside the file
		
		writer.write("First Line");
		writer.newLine();
		writer.write("Bangladesh");
		writer.newLine();
		writer.write("Way2Automation");
		writer.newLine();
		writer.write("Kabir");
		
		writer.close();
		
		System.out.println("File Created");
		
		
	 
		
		
		
		

	}

}
