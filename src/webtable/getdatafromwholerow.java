package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromwholerow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nmadh/OneDrive/Desktop/software%20testing%20notes/table.html");
		for(int i=1;i<=3;i++)
		{
			String data=driver.findElement(By.xpath("//table//tr[2]/td["+i+"]")).getText();
			System.out.print(data+" ");
		}
	}

}
