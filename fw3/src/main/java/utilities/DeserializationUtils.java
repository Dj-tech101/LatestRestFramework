package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationUtils {

	

	public static ObjectMapper obj;
	
	public static String path;
	
	public static String deserializedData(String payload) {
		String value=null;
		
		try {
			
			obj= new ObjectMapper();
			
				
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage())
			;
			System.out.println("Object is empty");
		}
		return value;
	}
}
