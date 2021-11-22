package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.ItemsUI;

public class Items {

	WebDriver driver;
	public Items(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getFirstItem() {
		return driver.findElement(ItemsUI.autoRikshaw);
	}
	public WebElement addToCart() {
		return driver.findElement(ItemsUI.autoRikshawAddtocart);
	}
	public WebElement giftWrap() {
		return driver.findElement(ItemsUI.giftwrap);
	}
	public WebElement giftNote() {
		return driver.findElement(ItemsUI.giftnote);
	}
	public WebElement fromDetails() {
		return driver.findElement(ItemsUI.from);
	}
	public WebElement toDetails() {
		return driver.findElement(ItemsUI.to);
	}
	public WebElement message() {
		return driver.findElement(ItemsUI.message);
	}
	public WebElement totalValue() {
		return driver.findElement(ItemsUI.totalValue);
	}
	public WebElement checkOut() {
		return driver.findElement(ItemsUI.checkout);
	}
}
