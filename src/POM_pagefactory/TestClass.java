package POM_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		Flipkart_home_page fhp=new Flipkart_home_page(driver);
		fhp.Clickonclose();
		fhp.ClickOnLogin();
		
		Flipkart_login_page flp=new Flipkart_login_page(driver);
		flp.entermobile();
		flp.enterPassword();
		flp.clickOnLogin();
		Thread.sleep(1000);
		fhp.ValidateUser();

	}

}
