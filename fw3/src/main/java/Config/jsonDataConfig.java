package Config;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonDataConfig {

	public static ObjectMapper obj;

	public static Map<String, Object> jsonData;

	public static Map<String, Object> getJsonData(String path) {

		
		try {
			
			obj= new ObjectMapper();
			
			jsonData=obj.readValue(new File(path), new TypeReference<Map<String, Object>>() {
			});
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jsonData;
	}
	
	
	
}
