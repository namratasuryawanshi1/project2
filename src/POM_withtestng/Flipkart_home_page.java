package POM_withtestng;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Flipkart_home_page {

		@FindBy(xpath="//button[text()='✕']")private WebElement close;
		@FindBy(xpath="//a[text()='Login']")private WebElement loginButton;
		
		@FindBy(xpath="//div[text()='Pooja']")private WebElement username;
		
		@FindBy(xpath="//a//div[text()='Logout']") private WebElement logout;
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
		
		public void ValidateUser(String expected)
		{
			String actualuser=username.getText();
		
			if(actualuser.equals(expected))
			{
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Test case failed");
				
			}
		
			
		}
		public void Clickonlogout(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(username).perform();
			act.click(logout).perform();
		}

	}




