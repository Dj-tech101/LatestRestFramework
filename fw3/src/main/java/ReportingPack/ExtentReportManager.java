package ReportingPack;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extentreports;

	public static ExtentReports createInstnace(String filePath) {

		sparkReporter = new ExtentSparkReporter(new File(filePath));

		extentreports = new ExtentReports();

		extentreports.attachReporter(sparkReporter);

		return extentreports;

	}

	
	public static void logInfoExtentReport (String log) {
		
		SetUp.extentTest.get().info(MarkupHelper.createLabel(log, ExtentColor.GREY));
	
	}
	
public static void logJsonExtentReport (String json) {
		
		SetUp.extentTest.get().info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
	
	}
	public static String getFileName() {

		SimpleDateFormat formate= new SimpleDateFormat("dd-MM-yyyyHH-mm-ss");
		
		Date date= new Date();
		
		return formate.format(date);

	}

}
