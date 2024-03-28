package testCases;

import static org.hamcrest.Matchers.*;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import endpoints.projectApis;
import io.restassured.response.Response;

public class Demo_Validate_ProjectCreation {

	public static String projectId;
	public Response res;
	public List<String>brandIds;
	
	@Test(priority = 1)
	public void validateProjectcreation() {
		
		res=projectApis.createProject("testCreation");
		projectId=res.jsonPath().getString("data.projectId");
		 
	     res
	     .then()
	     .assertThat()
	     .statusCode(200)
	     .statusLine(Matchers.containsString("HTTP/1.1 200 OK"));
	}
	
	
	@Test(priority = 2)
	public void valdiateProjectname() {
		res
		.then()
		.assertThat()
		.body("data.project.name", equalTo("testCreation"));
	}
	
	@Test(dependsOnMethods ="validateProjectcreation" )
	public void getBrandIds() {
		
		brandIds=res.jsonPath().getList("data.project.brand_ids");
		
	}
	@AfterClass
	public static void deleteProject() {
		
		projectApis.deleteProject(projectId);
	}
}
