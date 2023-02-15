package pOM_DDF_TestNG_Baseclass_utilityclass;


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
	}
	
	public void entermobile(String mob)
	{
		mobile.sendKeys(mob);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	}

