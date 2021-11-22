package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.GiftCardUI;


public class GiftCard {

	WebDriver driver;
	public GiftCard(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement thousand() {
		return driver.findElement(GiftCardUI.thousand);
	}
	public WebElement addToCart() {
		return driver.findElement(GiftCardUI.addToCart);
	}
	public WebElement giftCardValue() {
		return driver.findElement(GiftCardUI.giftCardValue);
	}
}
