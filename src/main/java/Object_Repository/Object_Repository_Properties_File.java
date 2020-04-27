package Object_Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Object_Repository_Properties_File {
	public static void main(String[] args) throws Exception {
		File src = new File("./Data.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties obj = new Properties();
		obj.load(fis);
		String data = obj.getProperty("MobileTesting");
		System.out.println(data);
	}
}
