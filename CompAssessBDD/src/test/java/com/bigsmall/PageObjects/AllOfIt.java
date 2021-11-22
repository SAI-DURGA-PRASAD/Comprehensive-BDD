package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.AllOfItUI;



public class AllOfIt {

	
	WebDriver driver;
	public AllOfIt(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getItem() {
		return driver.findElement(AllOfItUI.item);
	}
}
