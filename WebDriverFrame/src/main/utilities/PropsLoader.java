package main.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsLoader {

	private String fileName;
	
	public PropsLoader(String fileName){
		this.fileName = fileName;
	}
	
	public Properties loadProperties(){
		
		Properties prop = new Properties();
		InputStream fis = getClass().getClassLoader().getResourceAsStream(fileName);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
