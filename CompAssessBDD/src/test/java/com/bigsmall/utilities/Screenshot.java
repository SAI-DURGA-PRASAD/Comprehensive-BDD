package com.bigsmall.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.bigsmall.reusableComponents.BaseClass;


public class Screenshot extends BaseClass{

//	WebDriver driver;
	public static void takeScreenshot(String testName) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/screenshot "+getCurrentDateTime()+testName+".png"));
		
	}
	private static String getCurrentDateTime() {
		DateFormat textFormat = new SimpleDateFormat("MM_dd_yyyy__HH_mm_ss");
		
		Date currentDate = new Date();
		
		return textFormat.format(currentDate);
	}
}
