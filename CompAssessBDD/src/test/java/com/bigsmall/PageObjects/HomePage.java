package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.HomePageUI;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearch() {
		return driver.findElement(HomePageUI.search);
	}
	public WebElement getFirstItem() {
		return driver.findElement(HomePageUI.firstItem);
	}
	
	public WebElement signIn() {
		return driver.findElement(HomePageUI.signin);
	}
	
	public WebElement getAllofit() {
		return driver.findElement(HomePageUI.allofit);
	}
	public WebElement corporateGifts() {
		return driver.findElement(HomePageUI.corporate);
	}
	public WebElement gifts() {
		return driver.findElement(HomePageUI.gifts);
	}
	public WebElement birthdayGifts() {
		return driver.findElement(HomePageUI.birthdayGifts);
	}
	public WebElement personalizedGifts() {
		return driver.findElement(HomePageUI.personlizedGifts);
	}
	public WebElement whatsNew() {
		return driver.findElement(HomePageUI.whatsNew);
	}
	public WebElement giftCard() {
		return driver.findElement(HomePageUI.giftCard);
	}
}
