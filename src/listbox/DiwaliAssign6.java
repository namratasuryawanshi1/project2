package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiwaliAssign6 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[(@id=\"year\")]"));
		year.click();
		Thread.sleep(2000);
		
		Select obj= new Select(year);
		obj.selectByValue("2013");
		
		WebElement a=obj.getFirstSelectedOption();
		String s=a.getText();
		
		if(s.equalsIgnoreCase("2015"))
		{
			System.out.println("correct year is selected");
		}
		else
		{
			System.out.println(("wrong year is selected"));
		}
		
	}
	



	}


