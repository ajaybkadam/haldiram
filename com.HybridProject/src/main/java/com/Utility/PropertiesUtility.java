package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	
//1.why we need utility= to read property file
//2.what are inputs= key
//3.what will be output=value
	
 FileInputStream fis=null;	
	
public String readProperty(String key){
	
	Properties prop= new Properties();
	
	try {
		
		fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
		
	 catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	return prop.getProperty(key);
	
	
}
	
	
	
	
	
	
}
