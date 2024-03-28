package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationUtils {

	
	public static ObjectMapper obj;
	
	public static String path;
	
	public static <T> String serializedData(Class<T>para) {
		
		String value=null;
		try {
			
			obj= new ObjectMapper();
			
			value=obj.writerWithDefaultPrettyPrinter().writeValueAsString(para);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage())
			;
		}
		return value;
	}
}
