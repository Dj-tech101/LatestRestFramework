package endpoints;

import io.restassured.response.Response;
import projectPayload.payload;
import utilities.jsonUtiility;
import utilities.restUtils;

import static io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.annotations.Test;

public class projectApis {

	@Test
	public static Response createProject(String projectName) {

		String endpoint = jsonUtiility.getJsonObject("CreateProject");

		return restUtils.Post(endpoint, payload.projectPayload(projectName));

	}

	public static Response deleteProject(String id) {

		String endpoint = jsonUtiility.getJsonObject("DeleteProject");

		return restUtils.Delete(endpoint, id);

	}

	public static Response updateProject(String projectDetails) {

		String endpoint = jsonUtiility.getJsonObject("UpdateProject");

		return restUtils.Put(endpoint, projectDetails);
	}

	public static Response getProject() {

		String endpoint = jsonUtiility.getJsonObject("GetProject");

		return restUtils.Get(endpoint);

	}
	public static Response getBrandIDetails(Map<String, String>params) {

		String endpoint = jsonUtiility.getJsonObject("getBrandDetails");

		return restUtils.Get(endpoint,params);

	}
	
}
