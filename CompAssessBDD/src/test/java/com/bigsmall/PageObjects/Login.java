package com.bigsmall.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bigsmall.UIStore.LoginUI;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement email() {
		return driver.findElement(LoginUI.email);
	}
	public WebElement password() {
		return driver.findElement(LoginUI.password);
	}
	public WebElement submit() {
		return driver.findElement(LoginUI.signInButton);
	}

}
