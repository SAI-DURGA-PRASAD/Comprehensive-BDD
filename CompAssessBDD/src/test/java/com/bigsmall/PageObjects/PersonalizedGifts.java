package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.PersonalizedGiftsUI;



public class PersonalizedGifts {

	WebDriver driver;
	public PersonalizedGifts(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement sort() {
		return driver.findElement(PersonalizedGiftsUI.sort);
	}
	public WebElement bestSelling() {
		return driver.findElement(PersonalizedGiftsUI.bestSelling);
	}
	public WebElement firstBook() {
		return driver.findElement(PersonalizedGiftsUI.firstBook);
	}
}
