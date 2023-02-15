package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkarthome {
	@FindBy(xpath="//button[text()=\"✕\"]")private WebElement close;
	@FindBy(xpath="//a[text()=\"Login\"]")private WebElement loginButton;
	
	public flipkarthome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickonclose()
	{
		close.click();
	}
	public void clickonlogin()
	{
		loginButton.click();
	}

}
