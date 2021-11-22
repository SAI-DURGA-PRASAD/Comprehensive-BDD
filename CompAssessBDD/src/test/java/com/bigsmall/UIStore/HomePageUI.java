package com.bigsmall.UIStore;

import org.openqa.selenium.By;

public class HomePageUI {

	
	public static By search=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	public static By searchIcon=By.xpath("/html/body/div[10]/ul/li[2]");
	public static By firstItem=By.xpath("//*[@id=\'snize-product-6617900843206\']/a/div/span/span[1]");
	
	public static By signin = By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span");
	
	public static By corporate = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[1]/a");
	public static By allofit = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[12]/a");
	
	public static By gifts=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]");
	public static By birthdayGifts=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[7]/ul/li[4]/a");
	
	public static By personlizedGifts = By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[2]/a");
	
	public static By whatsNew = By.xpath("//*[@id=\"shopify-section-1598476309369\"]/div/a/div/button");
	
	public static By giftCard= By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]/span");
}