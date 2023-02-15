package project2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//step 1
		Thread.sleep(1000);
		
		driver.manage().window().minimize();//step 2
		Thread.sleep(1000);
		
		Dimension d=new Dimension(1000,700);
		driver.manage().window().setSize(d);//step3
		Thread.sleep(2000);
		
		System.out.println("Title"+driver.getTitle());//step 4
		System.out.println("URL"+driver.getCurrentUrl());
		Thread.sleep(2000);
		 driver.navigate().to("https://www.flipkart.com/");//step 5
		 Thread.sleep(2000);
		 driver.navigate().refresh();//step 6
		 
		 Thread.sleep(1000);
			Point p=new Point(400,200);
			driver.manage().window().setPosition(p);//step 7
			
			Thread.sleep(2000);
			
			 driver.navigate().back();//step 8
			 
			 String actualres=driver.getTitle();
			 System.out.println(actualres);
			 
			 if(actualres.equalsIgnoreCase(actualres))
			 {
				 System.out.println("facebook webpage Opened");
			 }
			 else
			 {
				 System.out.println("Test Failed");//step 9
				 
			 }
			 driver.navigate().refresh();//step 10
			 Thread.sleep(2000);
			 driver.close();//step 11
			 
			 
		

	}

}
