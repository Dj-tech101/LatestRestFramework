package utilities;

import ReportingPack.ExtentReportManager;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class printRequestDataReport {

	public static void printReqInfo(RequestSpecification requestSpecification) {

		QueryableRequestSpecification querable = SpecificationQuerier.query(requestSpecification);

		ExtentReportManager.logInfoExtentReport("getbaseUri " + querable.getBaseUri());

		ExtentReportManager.logInfoExtentReport("getHeaders " + querable.getHeaders().asList().toString());

		ExtentReportManager.logInfoExtentReport("ContentType " + querable.getContentType());
	}

	public static void printReSponseInfo(Response res) {

		ExtentReportManager.logInfoExtentReport("getbaseUri " + res.statusCode());

		ExtentReportManager.logInfoExtentReport("getHeaders " + res.getHeaders().asList().toString());

		ExtentReportManager.logInfoExtentReport("ContentType " + res.getContentType());
		ExtentReportManager.logJsonExtentReport(res.asString());
	}
}
