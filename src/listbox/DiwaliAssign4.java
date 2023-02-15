package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiwaliAssign4 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[(@id=\"month\" and @name=\"birthday_month\")]"));
		month.click();
		Thread.sleep(2000);
		Select obj= new Select(month);
		obj.selectByVisibleText("Aug");
		WebElement a=obj.getFirstSelectedOption();
		String s=a.getText();
		if(s.equalsIgnoreCase("Aug"))
		{
			System.out.println("correct month is selected");
		}
		else
		{
			System.out.println(("wrong month is selected"));
		}
		
	}

}
