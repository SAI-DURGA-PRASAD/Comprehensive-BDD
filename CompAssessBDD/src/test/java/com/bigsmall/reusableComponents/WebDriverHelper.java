package com.bigsmall.reusableComponents;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {

	
	public static WebDriver driverInitializer(WebDriver driver, String browserName, int implicitWait,Logger log) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Started the Chrome Browser");
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("Started the FireFox Browser");
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			log.info("Started the Edge Browser");
			
		}
		else {
			System.out.println("Unable to run with Mentioned browser");
			log.info("Unable to run with Mentioned browser");
			driver = null;
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS); 	//Implicit Wait in given in seconds
		
		return driver;
	}
	public static WebDriver quitDriver(WebDriver driver) {
		driver.quit();
		driver = null;
		return driver;
	}
}
