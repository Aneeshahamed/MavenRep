package writeDataNotepad;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOperation {

	public static void main(String[] args) throws Exception 
	{
		File file = new File("C:\\Users\\Aneesh Ahamed\\Desktop\\date.txt");	
		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
            FileWriter writer = new FileWriter("C:\\Users\\Aneesh Ahamed\\Desktop\\date.txt", true);
            writer.write("\r\n"); 
            writer.write("Hello World");          
            writer.write("Good Bye!");
            writer.close();
        }
		catch (IOException e) {
            e.printStackTrace();
        }
	}
}
