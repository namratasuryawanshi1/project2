package POM_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_login_page {
@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement mobile;
@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement password;
@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")private WebElement loginbutton;
public Flipkart_login_page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}public void entermobile()
{
	mobile.sendKeys("8482809373");
}
public void enterPassword()
{
	password.sendKeys("Hello@1234");
}
public void clickOnLogin()
{
	loginbutton.click();
}

}
