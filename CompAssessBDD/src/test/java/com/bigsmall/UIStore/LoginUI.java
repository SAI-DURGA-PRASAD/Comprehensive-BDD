package com.bigsmall.UIStore;

import org.openqa.selenium.By;

public class LoginUI {

	public static By email = By.xpath("//*[@id='CustomerEmail']");
	public static By password = By.xpath("//*[@id='CustomerPassword']");
	public static By signInButton = By.xpath("//*[@id='customer_login']/p[1]/input");
}
