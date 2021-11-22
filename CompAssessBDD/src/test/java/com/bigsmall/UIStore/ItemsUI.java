package com.bigsmall.UIStore;

import org.openqa.selenium.By;

public class ItemsUI {

	
	public static By autoRikshaw = By.xpath("//*[@id='AddToCartForm-6923369087174']/button/span");
	public static By autoRikshawAddtocart = By.xpath("//*[@id='AddToCartForm-6923369087174']/button/span");
	
	public static By giftwrap = By.xpath("//*[@id='gift-wrapping']");
	public static By giftnote = By.xpath("//*[@id='cart-notes']");
	
	public static By from = By.xpath("//*[@id='from']");
	public static By to = By.xpath("//*[@id='to']");
	public static By message = By.xpath("//*[@id='gift-card']");
	
	public static By totalValue = By.xpath("//*[@id='CartDrawer']/form/div[2]/div[3]/div[2]/div[2]/span/span");
	public static By checkout = By.xpath("//button[@name='checkout']");
}
