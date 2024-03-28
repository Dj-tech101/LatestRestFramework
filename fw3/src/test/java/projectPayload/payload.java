package projectPayload;

public class payload {

	
public static String projectPayload(String ProjectName) {
		
		return "{\r\n"
				+ "  \"projectName\":\""+ProjectName+"\"\r\n"
				+ "}";
	}
}
