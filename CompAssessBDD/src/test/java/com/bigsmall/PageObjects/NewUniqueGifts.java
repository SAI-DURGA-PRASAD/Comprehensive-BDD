package com.bigsmall.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.NewUniqueGiftsUI;

public class NewUniqueGifts {

	WebDriver driver;
	public NewUniqueGifts(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> items() {
		return driver.findElements(NewUniqueGiftsUI.items);
	}
	public WebElement firstItem() {
		return driver.findElement(NewUniqueGiftsUI.firstItem);
	}
}
