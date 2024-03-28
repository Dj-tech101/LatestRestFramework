package utilities;

import java.net.URLEncoder;
import java.util.List;

public class encoderUtils {

	public static String getEncodedValue(List<String> arr) {

		String value = String.join(",", arr);

		String check = null;

		try {

			check = URLEncoder.encode(value, "UTF-8");

		} catch (Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
		return check;
	}
}
