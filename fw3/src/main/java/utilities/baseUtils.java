package utilities;

import java.io.File;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseLogSpecification;

public class baseUtils {
	public static final String baseUri = "https://test.dockproductsordercenter.com";

	public static RequestLoggingFilter reqlog;
	
	public static ResponseLoggingFilter resLog;

	protected static PrintStream p;

	
	public static RequestSpecification req() {
			
			String filePath = "C:\\Users\\webca\\eclipse-workspace\\fw3\\logginFolder\\logFile.text";
			
			try {
				
				p = new PrintStream(new File(filePath));

			} catch (Exception e) {
			
			}
			return RestAssured.given().headers(headerUtils.getHeaders()).baseUri(baseUri);
		}
}
