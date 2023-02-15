package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsize_colsize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nmadh/OneDrive/Desktop/software%20testing%20notes/table.html");
		List<WebElement> row=driver.findElements(By.xpath("//table//tr"));
		System.out.println(row.size());
		
		List<WebElement> col=driver.findElements(By.xpath("//table//tr/td[2]"));
		System.out.println(col.size());
	}

}
