package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiwaliAssign5 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//select[(@id=\"day\")]"));
		day.click();
		Thread.sleep(2000);
		
		Select obj= new Select(day);
		obj.selectByValue("3");
		WebElement a=obj.getFirstSelectedOption();
		String s=a.getText();
		if(s.equalsIgnoreCase("3"))
		{
			System.out.println("correct day is selected");
		}
		else
		{
			System.out.println(("wrong  day is selected"));
		}
		
	}
	}


