package org.dataReader.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropFile {

	//@Test
	public static String readDataFromPropFile(String key) throws Exception{
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is = " + projectPath);
		
		Properties prop = new Properties();
		
		String filePath = projectPath + "\\data\\testData.properties";
		
		File file = new File(filePath);
		FileInputStream fip = new FileInputStream(file);
		
		prop.load(fip);
		
		String value = prop.getProperty(key);
		return value;
	}
}
