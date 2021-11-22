package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.CorporateGiftsUI;

public class CorporateGifts {

	WebDriver driver;
	public CorporateGifts(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement fullName() {
		return driver.findElement(CorporateGiftsUI.fullName);
	}
	public WebElement email() {
		return driver.findElement(CorporateGiftsUI.email);
	}
	public WebElement phoneNumber() {
		return driver.findElement(CorporateGiftsUI.phoneNumber);
	}
	public WebElement enquiry() {
		return driver.findElement(CorporateGiftsUI.enquiry);
	}
	public WebElement submit() {
		return driver.findElement(CorporateGiftsUI.submit);
	}
	public WebElement successNote() {
		return driver.findElement(CorporateGiftsUI.successNote);
	}
	public WebElement robotCheckNote() {
		return driver.findElement(CorporateGiftsUI.robotCheck);
	}
}
