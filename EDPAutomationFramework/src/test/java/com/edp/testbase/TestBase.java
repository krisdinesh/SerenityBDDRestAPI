package com.edp.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {
	
	
	
	@BeforeClass
	public static void init(){
		
		Properties prop = new Properties();
		InputStream input = null;
		String url;
		try {
			
			input = new FileInputStream("properties/config.properties");
			prop.load(input); 
			System.out.println("ENDPOINT:" + prop.getProperty("BASE_URL"));
			url = prop.getProperty("BASE_URL");
			RestAssured.baseURI = url;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}	
	}
}
