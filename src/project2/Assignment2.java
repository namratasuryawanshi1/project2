package project2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadh\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");//step 1
		Thread.sleep(1000);
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);//step 2
		
		Thread.sleep(2000);
		driver.manage().window().maximize();//step 3
		
		 String actualres=driver.getTitle();
		 System.out.println(actualres);
		 
		 if(actualres.equalsIgnoreCase(actualres))
		 {
			 System.out.println("Amazon webpage Opened");
		 }
		 else
		 {
			 System.out.println("Test Failed");//step 4
			 
		 }
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.flipkart.com/");//step 5
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.google.com/");//step 6
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.facebook.com/");//step 7
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		
		 driver.navigate().back();//step 8
		 Thread.sleep(2000);
		 
		 Dimension d=new Dimension(700,700);
		 driver.manage().window().setSize(d);//step 9
		 
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();//step 10
		 Thread.sleep(2000);
		 
		 String actualres1=driver.getTitle();
		 System.out.println(actualres1);
		 
		 if(actualres.equalsIgnoreCase(actualres))
		 {
			 System.out.println("facebook webpage opened");
		 }
		 else
		 {
			 System.out.println("Test Failed");//step 11
			 
		 }
		 
		 driver.navigate().refresh();//step 12
		 
		 Thread.sleep(2000);
		 driver.close();//step 13
		 
	
		 
		 
		 
		 
		 
		 
		 		
		 		
		 
		 
		 
		
		
		
	}

}
