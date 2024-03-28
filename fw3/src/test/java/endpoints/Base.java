package endpoints;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseLogSpecification;
import utilities.headerUtils;

public class Base {

	public static RequestSpecification req;
	
	public static ResponseLogSpecification res;
	
	public static final String baseUri = "https://test.dockproductsordercenter.com";

	

	protected static PrintStream p;

	public static RequestSpecification req() throws FileNotFoundException {
		
		
		
		String filePath = "C:\\Users\\webca\\eclipse-workspace\\fw3\\logging.txt";
		
		FileOutputStream f1= new FileOutputStream(filePath);
		
		p= new PrintStream(f1);

		return RestAssured.given().filters(RequestLoggingFilter.logRequestTo(p), ResponseLoggingFilter.logResponseTo(p)).headers(headerUtils.getHeaders()).baseUri(baseUri);

	}

}
