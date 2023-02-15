package project2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	Dimension d=driver.manage().window().getSize();
	 System.out.println("Size"+d);
	 
	 Point p=driver.manage().window().getPosition();
	 
	 System.out.println("position"+p);
	}

}
