package utilities;

import java.util.HashMap;
import java.util.Map;

public class headerUtils {
	
	public static Map<String, String> getHeaders() {
		
		 Map<String, String>header= new HashMap<String, String>();
		 
		  header.put("Authorization", "Bearer 660530ef65379750d9803ce6");
		  header.put("Content-type", "application/json");
		  header.put("Accept", "application/json");
		  header.put("Referer", "https://test.dockproductsordercenter.com/order-center");
		  
		return header;
	}
}
