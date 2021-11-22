package com.bigsmall.reusableComponents;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.bigsmall.PageObjects.AllOfIt;
import com.bigsmall.PageObjects.CorporateGifts;
import com.bigsmall.PageObjects.GiftCard;
import com.bigsmall.PageObjects.HomePage;
import com.bigsmall.PageObjects.Items;
import com.bigsmall.PageObjects.Login;
import com.bigsmall.PageObjects.NewUniqueGifts;
import com.bigsmall.PageObjects.PersonalizedGifts;
import com.bigsmall.utilities.ConfigsProvider;
import com.bigsmall.utilities.ExtentReporter;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config = new ConfigsProvider();;
	public static ExtentReporter reporter = new ExtentReporter(config.getExtentPath());;
	public static ExtentTest test;
	
	public static HomePage homepage;
	public static AllOfIt allofit;
	public static Items items;
	public static CorporateGifts corporateGifts;
	public static PersonalizedGifts personalizedGifts;
	public static Login login;
	public static NewUniqueGifts newUniqueGifts;
	public static GiftCard giftCard;
	
	
//	public BaseClass() {
//		
//		log = Logger.getLogger(getClass());
//		
//		homepage = new HomePage(driver);
//		allofit = new AllOfIt(driver);
//		items = new Items(driver);
//		corporateGifts = new CorporateGifts(driver);
//		personalizedGifts = new PersonalizedGifts(driver);
//		login = new Login(driver);
//		newUniqueGifts = new NewUniqueGifts(driver);
//		giftCard = new GiftCard(driver);
//	}
//	
//	
//	@BeforeSuite
//	public void startup() {
//		
//		log = Logger.getLogger(getClass());
//		config = new ConfigsProvider();
//		reporter = new ExtentReporter(config.getExtentPath());
//		test = reporter.startTest("BaseClass");
//		
//		
//	}
//	@BeforeClass
//	public void beforeClass() {
//		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait(), log);
//		if(driver != null) {
//			log.info("Initialized driver successfully");
//		}
//		else {
//			log.error("Driver not Initialized");
//		}
//		
//		
//	}
//	
//	
//	@AfterClass
//	public void classTeardown() {
//		driver = WebDriverHelper.quitDriver(driver);
//		if(driver == null) {
//			log.info("Driver Closed successfully and set to null");
//		}
//		
//	}
//	@AfterSuite
//	public void suiteTeardown() {
//		
////		WebDriverHelper.quitDriver(driver);
////		if(driver == null) {
////			log.info("Driver Closed successfully and set to null");
////		}
//		
//		reporter.endTest(test);
//		reporter.close();
//	}
}
