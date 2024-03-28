package ReportingPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class SetUp implements ITestListener {

	private static ExtentReports extentReports;
	
	public static ThreadLocal<ExtentTest>extentTest= new ThreadLocal<ExtentTest>();
	
	

	public void onStart(ITestContext context) {

		String filename = ExtentReportManager.getFileName();

		String fullFileName = "C:\\Users\\webca\\eclipse-workspace\\fw3\\reporting" + filename + ".html";

		extentReports = ExtentReportManager.createInstnace(fullFileName);
	}

	public void onFinish(ITestContext context) {

		if (extentReports != null) {

			extentReports.flush();

		}
	}
	public void onTestStart(ITestResult result) {

	ExtentTest test=extentReports.createTest(result.getClass().getName()+"/"+result.getMethod().getMethodName());
		
	    extentTest.set(test);
	    
}
}