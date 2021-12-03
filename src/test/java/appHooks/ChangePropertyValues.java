package appHooks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChangePropertyValues {
	@Test
	@Parameters({"browser","url"})
	
	public void changePropertyValues(String browserValue,String urlValue) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		BufferedWriter bw=new BufferedWriter(fw);
		try {
			bw.write("browser="+browserValue);
			bw.newLine();
			bw.write("url="+urlValue);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
	
	

}
