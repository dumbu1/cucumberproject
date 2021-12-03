package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
private static FileInputStream fis;
	public Properties propertyReader() {
		try {
			  fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties");
		} catch (FileNotFoundException e) {
			 System.out.println(e);
		
	}
		Properties pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			 System.out.println("e");
		}
		
		return pro;
	}
}
