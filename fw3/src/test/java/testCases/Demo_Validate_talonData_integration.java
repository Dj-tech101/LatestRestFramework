package testCases;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import endpoints.projectApis;
import io.restassured.response.Response;
import utilities.baseUtils;
import utilities.encoderUtils;
import utilities.printRequestDataReport;

public class Demo_Validate_talonData_integration {

	public static String projectId;
	public Response res;
	public List<String>brandIds;
	
	@Test(priority = 1)
	public void validateProjectcreation() {
		
		printRequestDataReport.printReqInfo(baseUtils.req());
		res=projectApis.createProject("testCreation");
		projectId=res.jsonPath().getString("data.projectId");
		
		printRequestDataReport.printReSponseInfo(res);
		 
	}
//	@Test(dependsOnMethods ="validateProjectcreation" )
//	public void getBranddetails() {
//		
//		brandIds=res.jsonPath().getList("data.project.brand_ids");
//		
//		Map<String, String>data= new HashMap<String, String>();
//		
//		data.put("orderId", projectId);
//		data.put("brandId", encoderUtils.getEncodedValue(brandIds));
//		
//		Response res= projectApis.getBrandIDetails(data);
//		
//		System.out.println(res.prettyPrint());
//		
//	}
//	
//	public static void getTheTalonBeandIds() {
//		
//	}
	@AfterClass
	public static void deleteProject() {
		
		projectApis.deleteProject(projectId);
	}
}
