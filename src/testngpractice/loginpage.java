package testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath="//input[@id=\"ap_email\"]")private WebElement mobilenumber;
	@FindBy(xpath="//input[@id=\"continue\"]")private WebElement cont;
	@FindBy(xpath="//input[@id=\"ap_password\"]")private WebElement password;
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")private WebElement clickonsignin;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void entermobileno(String mob)
	{
		mobilenumber.sendKeys(mob);
	}
	public void Clickoncontinue()
	{
		cont.click();
	}
	
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonsignin()
	{
		clickonsignin.click();
	}
	
}
