package POM_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_home_page {

	@FindBy(xpath="//button[text()='✕']")private WebElement close;
	@FindBy(xpath="//a[text()='Login']")private WebElement loginButton;
	
	@FindBy(xpath="//div[text()='Pooja']")private WebElement username;
	public Flipkart_home_page(WebDriver driver)
{
		PageFactory.initElements(driver,this);
		
	}
	public void Clickonclose()
	{
		close.click();
	}
	public void ClickOnLogin()
	{
		loginButton.click();
	}
	
	public void ValidateUser()
	{
		String actualuser=username.getText();
		String expecteduser="Pooja";
		if(actualuser.equals(expecteduser))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
			
		}
	
		
	}
}

