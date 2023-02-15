package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);

		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
	}

}
