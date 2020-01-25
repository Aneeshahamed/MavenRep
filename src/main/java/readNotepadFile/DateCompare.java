package readNotepadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {

	public static void main(String[] args) throws Exception {
		Date d1 = null,d2 = null;
		File file = new File("C:\\Users\\Aneesh Ahamed\\Desktop\\date.txt");
		String ch ;
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int line = 0;
		String st;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter date (dd-mm-yyyy)");
			String Ent = s.nextLine();
            FileWriter writer = new FileWriter("C:\\Users\\Aneesh Ahamed\\Desktop\\date.txt", true);
            writer.write("\r\n"); 
            writer.write(Ent);
            writer.close();
            
            while ((st = br.readLine()) != null) 
    		{
    			line++;
    		}
    		String[] All_Date1 = new String[line];
    		String[] All_Date2 = new String[line];
    		BufferedReader brc1 = new BufferedReader(new FileReader(file));
    		for (int i = 0; i < line; i++)
    		{
    			SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
    			All_Date1[i] = brc1.readLine();
    			BufferedReader brc2 = new BufferedReader(new FileReader(file));
    			d1 = s1.parse(All_Date1[i]); 
    			for(int j = 0; j < line; j++)
    			{ 
    				All_Date2[j] = brc2.readLine();
    				d2 = s1.parse(All_Date2[j]);
    				if (d1.compareTo(d2) > 0)
    				{
    					d1 = s1.parse(All_Date1[i]);
    				}
    			}
    		}System.out.println(d1);
        }
		catch (IOException e) {
            e.printStackTrace();
        }
		
		
		

	}

}
