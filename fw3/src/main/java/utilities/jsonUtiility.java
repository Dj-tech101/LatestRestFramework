package utilities;

import java.util.Map;

import Config.jsonDataConfig;

public class jsonUtiility {


	public static String getJsonObject(String endpoint) {
		
		jsonDataConfig config= new jsonDataConfig();
		
		String path="C:\\Users\\webca\\eclipse-workspace\\fw3\\src\\main\\java\\environment\\QA.json";
				
		String value=(String) config.getJsonData(path).get(endpoint);
		
		
		return value;
		
	}
	
	

}
