package com.bigsmall.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReporter {

	public static ExtentReports report;
	public ExtentReporter(String path) {
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd__hh-mm-ss");
		path = path.replaceAll("%timestamp", format.format(date));
		
		report = new ExtentReports(path);
	}


	public void endTest(ExtentTest test) {
		report.endTest(test);
	}

	public void close() {
		report.flush();
	}


	public ExtentTest startTest(String classname) {
		return report.startTest(classname);
	}
	
}
