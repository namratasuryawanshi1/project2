package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromcell {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nmadh/OneDrive/Desktop/software%20testing%20notes/table.html");
		WebElement cell=driver.findElement(By.xpath("//table//tr[4]//td[2]"));
		System.out.println(cell.getText());
	}

}
