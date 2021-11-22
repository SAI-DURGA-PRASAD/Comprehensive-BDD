package com.bigsmall.UIStore;

import org.openqa.selenium.By;

public class PersonalizedGiftsUI {

	public static By sort = By.id("sortBy");
	public static By bestSelling = By.xpath("//*[@id='sortBy']/option[3]");
	
	public static By firstBook = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[1]/div/a/div[2]/div[1]");
}
