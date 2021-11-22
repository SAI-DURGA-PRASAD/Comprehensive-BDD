package com.bigsmall.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bigsmall.PageObjects.AllOfIt;
import com.bigsmall.PageObjects.CorporateGifts;
import com.bigsmall.PageObjects.GiftCard;
import com.bigsmall.PageObjects.HomePage;
import com.bigsmall.PageObjects.Items;
import com.bigsmall.PageObjects.Login;
import com.bigsmall.PageObjects.NewUniqueGifts;
import com.bigsmall.PageObjects.PersonalizedGifts;
import com.bigsmall.reusableComponents.BaseClass;
import com.bigsmall.reusableComponents.WebDriverHelper;
import com.bigsmall.utilities.Screenshot;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass{

	
	@Given("Initialize the WebDriver")
	public void initialize_the_web_driver() throws IOException {
		test = reporter.startTest(getClass().getSimpleName());
		log = Logger.getLogger(getClass());
		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait(), log);
		if(driver == null) {
			Assert.assertTrue(false);
			log.info("driver not Initialized successfully");
			
		}
		else {
			log.info("driver Initialized successfully");
		}
		
		
		
		homepage = new HomePage(driver);
		allofit = new AllOfIt(driver);
		items = new Items(driver);
		corporateGifts = new CorporateGifts(driver);
		personalizedGifts = new PersonalizedGifts(driver);
		login = new Login(driver);
		newUniqueGifts = new NewUniqueGifts(driver);
		giftCard = new GiftCard(driver);
	}
	@When("Navigate to Landing Page")
	public void navigate_to_landing_page() {
	    driver.get(config.getURL());
	}
	@Then("Validates Hompage title")
	public void validates_hompage_title() throws IOException {
	    if(driver.getTitle().equalsIgnoreCase("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in")) {
	    	test.log(LogStatus.PASS,"Homepage title is validated");
			log.info("Homepage title is validated");
			Screenshot.takeScreenshot("Title Validation");
	    }
	    else {
			test.log(LogStatus.FAIL,"System failed to load Homepage");
			log.info("System failed to load Homepage");
		}
	}
	@Then("Close the driver")
	public void close_the_driver() {
		WebDriverHelper.quitDriver(driver);
		if(driver == null) {
			log.info("Driver Closed successfully and set to null");
			reporter.endTest(test);
		}
		log.info("End of "+getClass().getSimpleName()+" TestCase");
	}
	
	
	
	
	//-----------------------------------------------------------------
	//--------------------------------------------------------------------
	@Then("^Validates BirthdayGiftsPage title$")
    public void validates_birthdaygiftspage_title() throws Throwable {
    	if(driver.getTitle().equalsIgnoreCase("Unique Birthday Gifts - Buy Best Gifts for Bday Online in India– Bigsmall.in")) {
	    	test.log(LogStatus.PASS,"Birthday GiftsPage title is validated");
			log.info("Birthday GiftsPage title is validated");
			Screenshot.takeScreenshot("BirthdayGiftsTest");
	    }
	    else {
			test.log(LogStatus.FAIL,"System failed to load Birthday GiftsPage");
			log.info("System failed to load Birthday GiftsPage");
		}
    }

    @And("^moveto Gifts section and click on BirthdayGifts Page$")
    public void moveto_gifts_section_and_click_on_birthdaygifts_page() throws Throwable {
    	Actions action = new Actions(driver);
		action.moveToElement(homepage.gifts()).perform();
		homepage.birthdayGifts().click();
    }
    
    
  //-----------------------------------------------------------------
  //--------------------------------------------------------------------
    
    @Then("^Validates the price of item and Click on checkout$")
    public void validates_the_price_of_item_and_click_on_checkout() throws Throwable {
        
    	if(items.totalValue().getText().equals("Rs. 799")){
			items.checkOut().click();
			Thread.sleep(5000);
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
			// This test will endup in getting to the chekout page
			test.log(LogStatus.PASS, "System added item to cart and entered into CheckoutPage");
			log.info("System added item to cart and entered into CheckoutPage");
			Screenshot.takeScreenshot("AddingItemtoCart");
		}
		else {
			test.log(LogStatus.FAIL, "System failed to add to cart & enter into CheckoutPage");
			log.info("System failed to add to cart & enter into CheckoutPage");
		}
    }

    @And("^Click on AllofIt and add firstItem to cart$")
    public void click_on_allofit_and_add_firstitem_to_cart() throws Throwable {
    	homepage.getAllofit().click();
		allofit.getItem().click();
		items.getFirstItem().click();
		items.addToCart().click();
		Thread.sleep(3000);
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    @And("^select GiftWrap and add giftNote to it$")
    public void select_giftwrap_and_add_giftnote_to_it() throws Throwable {
    	items.giftWrap().click();
		Thread.sleep(3000);
		items.giftNote().click();
		items.fromDetails().sendKeys("Sample from");
		items.toDetails().sendKeys("Sample to");
		items.message().sendKeys("Sample message");
    }
    @Then("^Validates the price of item with giftWrap and Click on checkout$")
    public void validates_the_price_of_item_with_giftwrap_and_click_on_checkout() throws Throwable {
    	if(items.totalValue().getText().equals("Rs. 844")) {
			items.checkOut().click();
			Thread.sleep(5000);
			System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
			// This test will endup in getting to the chekout page
			test.log(LogStatus.PASS, "System added item to cart with giftWrap and entered into CheckoutPage");
			log.info("System added item to cart with giftWrap and entered into CheckoutPage");
			Screenshot.takeScreenshot("AddingItemtoCartWithGiftcard");
		}
		else{
			test.log(LogStatus.FAIL, "System failed to add to cart with giftWrap & enter into CheckoutPage");
			log.info("System failed to add to cart with giftWrap & enter into CheckoutPage");
		}
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    @Then("^Check for robotCheckNote$")
    public void check_for_robotchecknote() throws Throwable {
    	if(corporateGifts.robotCheckNote().getText().equalsIgnoreCase("To continue, let us know you're not a robot.")){
			test.log(LogStatus.PASS, "System successfully entered the details shown robotCheckNote");
			log.info("System successfully entered the details shown robotCheckNote");
			
			Screenshot.takeScreenshot("CorporateGiftsTest");
		}
    	else{
			test.log(LogStatus.FAIL, "System failed to show robotCheckNote");
			log.info("System failed to show robotCheckNote: ");
		}
    }

    @And("^Click on CorporateGifts$")
    public void click_on_corporategifts() throws Throwable {
    	homepage.corporateGifts().click();
    }

    @And("^Enter (.+), (.+) , (.+) , (.+) and click on Submit$")
    public void enter_and_click_on_submit(String fullname, String email, String phonenumber, String enquiry) throws Throwable {
    	corporateGifts.fullName().sendKeys(fullname);
		corporateGifts.email().sendKeys(email);
		corporateGifts.phoneNumber().sendKeys(phonenumber);
		corporateGifts.enquiry().sendKeys(enquiry);
		corporateGifts.submit().click();
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    @Then("^Validate the giftCard value in cart$")
    public void validate_the_giftcard_value_in_cart() throws Throwable {
    	if(giftCard.giftCardValue().getText().equalsIgnoreCase("Rs. 1,000")){
			test.log(LogStatus.PASS, "System clicked on same GiftCard Value as mentioned");
			log.info("System clicked on same GiftCard Value as mentioned");
			Screenshot.takeScreenshot("GiftCardTest");
		}
    	else {
			test.log(LogStatus.PASS, "System not clicked on same GiftCard Value as mentioned");
			log.info("System not clicked on same GiftCard Value as mentioned");
		}
    }

    @And("^click on GiftCard and add thousand giftCard to cart$")
    public void click_on_giftcard_and_add_thousand_giftcard_to_cart() throws Throwable {
    	homepage.giftCard().click();
		Thread.sleep(10000);
		giftCard.thousand().click();
		giftCard.addToCart().click();
		Thread.sleep(4000);
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    @Then("^Enter (.+) and (.+) then click on Submit$")
    public void enter_and_then_click_on_submit(String username, String password) throws Throwable {
    	login.email().sendKeys(username);
		login.password().sendKeys(password);
		login.submit().click();
		
		test.log(LogStatus.PASS,"System successfully entered login details");
		log.info("System successfully entered login details");
		Screenshot.takeScreenshot("LoginTest");
		
    }

    @And("^click on SignIn$")
    public void click_on_signin() throws Throwable {
    	homepage.signIn().click();
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    @Then("^validate for firstBook in bestselling$")
    public void validate_for_firstbook_in_bestselling() throws Throwable {
    	
    	if(personalizedGifts.firstBook().getText().equalsIgnoreCase("Personalized Moon Lamp - COD Not Available")) {
			log.info("System shown the bestselling product");
			test.log(LogStatus.PASS, "System shown the bestselling product");
			Screenshot.takeScreenshot("Personalized Gifts Test");
		}
    	else {
			test.log(LogStatus.FAIL, "System unable to show the bestselling product");
			log.info("System unable to show the bestselling product");
		}
    }

    @And("^click on PersonalisedGifts and sort by BestSelling$")
    public void click_on_personalisedgifts_and_sort_by_bestselling() throws Throwable {
        
    	homepage.personalizedGifts().click();
		personalizedGifts.sort().click();
		personalizedGifts.bestSelling().click();
		
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    
    @Then("^validate first item in search Results$")
    public void validate_first_item_in_search_results() throws Throwable {
    	if(homepage.getFirstItem().getText().equalsIgnoreCase("Harry Potter Plush Soft Toy")) {
			log.info("System shown the first book as mentioned");
			test.log(LogStatus.PASS, "System shown the first book as mentioned");
			Screenshot.takeScreenshot("SearchTest");
//			Thread.sleep(5000);
		} 
    	else{
			log.info("System unable to show the first book as mentioned");
			test.log(LogStatus.FAIL, "System unable to show the first book as mentioned");
		}
    }

    @And("^click on search and search for \"([^\"]*)\" keyword$")
    public void click_on_search_and_search_for_something_keyword(String strArg1) throws Throwable {
    	
    	homepage.getSearch().sendKeys(strArg1);
		
		homepage.getSearch().sendKeys(Keys.ENTER);
		
    }
    
    //-----------------------------------------------------------------
    //--------------------------------------------------------------------
    
    
    @Then("^Check for existance of \"([^\"]*)\"$")
    public void check_for_existance_of_something(String strArg1) throws Throwable {
    	boolean flag = false;
		List<WebElement> list = newUniqueGifts.items();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase("Handmade Buddha Diary")) {
				log.info("Desired item found in Whats new page");
				list.get(i).click();
				Thread.sleep(5000);
				flag =true;
				test.log(LogStatus.PASS,"System opened the desired item");
				log.info("System opened the desired item");
				Screenshot.takeScreenshot("WhatsNew");
				break;
			}
		}
		if(!flag) {
			test.log(LogStatus.FAIL, "System unable to find the desired item");
			log.info("System unable to find the desired item");
		}

    }

    @And("^click on WhatsNew$")
    public void click_on_whatsnew() throws Throwable {
    	homepage.whatsNew().click();
    }
    
    //===========================================================
    //===========================================================
    @And("^Generate Report$")
    public void generate_report() throws Throwable {
    	reporter.close();
    }

}
