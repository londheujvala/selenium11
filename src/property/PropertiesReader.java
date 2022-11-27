package property;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) throws IOException  {
		
		String msg=System.getProperty("user.dir");
		System.out.println(msg);
		File f=new File(System.getProperty("user.dir")+"\\env.Properties");
		
		FileInputStream Fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		prop.load(Fis);
		String ss= prop.getProperty("baseUrl");
		
		System.out.println(ss);
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("passWord"));
		
		
	}

}
