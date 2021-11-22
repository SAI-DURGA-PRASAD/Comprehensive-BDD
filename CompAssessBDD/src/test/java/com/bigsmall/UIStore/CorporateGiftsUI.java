package com.bigsmall.UIStore;

import org.openqa.selenium.By;

public class CorporateGiftsUI {

	public static By fullName = By.id("contactFormName");
	public static By email = By.id("contactFormEmail");
	public static By phoneNumber = By.id("contactFormPhone");
	public static By enquiry = By.id("contactFormMessage");
	public static By submit = By.xpath("//*[@id='contactFormWrapper']/div/input[4]");
	public static By successNote = By.xpath("//p[@class='note form-success']");
	
	public static By robotCheck = By.xpath("//*[@id='MainContent']/div[1]/p");
}
