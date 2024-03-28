package utilities;

import java.util.Map;

import io.restassured.response.Response;

public class restUtils {

	public static Response Post(String endpoint, String payload) {
		
		 return baseUtils.req().body(payload).post(endpoint);
	}

	public static Response Put(String endpoint, String payload) {
		return baseUtils.req().body(payload).put(endpoint);
	}

	public static Response Get(String endpoint) {
		return baseUtils.req().get(endpoint);

	}

	public static Response Delete(String endpoint, String body) {
		return baseUtils.req().body(body).delete(endpoint);
	}
	public static Response Get(String endpoint,Map<String, String>params) {
		return baseUtils.req().queryParams(params).get(endpoint);

	}
}
