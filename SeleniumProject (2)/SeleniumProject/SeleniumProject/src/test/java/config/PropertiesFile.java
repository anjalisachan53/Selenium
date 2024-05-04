package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.AmazonTestNg;

public class PropertiesFile {

	static Properties prop=new Properties();
	static String path=System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {
		try {
		InputStream input=new FileInputStream(path+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		AmazonTestNg.browsername=browser;
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream output=new FileOutputStream(path+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "firefox");
			prop.store(output, null);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
}
