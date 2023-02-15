package testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
@FindBy(xpath="//span[text()=\"Hello, sign in\"]")private WebElement signin;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickonsignin()
	{
		signin.click();
	}
}
