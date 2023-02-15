package practiceproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
	List<WebElement> row=driver.findElements(By.xpath("//table//tr"));
	List<WebElement> col=driver.findElements(By.xpath("//table//tr/th"));
	System.out.println("row"+row.size());
	System.out.println("col"+col.size());
	
//	WebElement cell=driver.findElement(By.xpath("//table//tr[4]/td[1]"));
//	System.out.println(cell.getText());
//	for(int i=1;i<=3;i++)
//	{
//	  String r1=driver.findElement(By.xpath("//table//tr[5]/td["+i+"]")).getText();
//	  System.out.println(r1);
//	}
//	System.out.println("******************");
//	for(int i=1;i<=5;i++)
//	{
//		if(i==1)
//		{
//			System.out.println(driver.findElement(By.xpath("//table//tr["+i+"]/th[3]")).getText());
//		}
//		else
//		{
//			
//		
//			String r2=driver.findElement(By.xpath("//table//tr["+i+"]/td[3]")).getText();
//			System.out.println(r2);
//		}
//	}
	//get data from whole table
	for(int i=1;i<=col.size();i++)
	{
		String data1=driver.findElement(By.xpath("//table//tr/th["+i+"]")).getText();
		System.out.print(data1+" ");
	for(int j=2;j<=row.size();j++)
	{
		String data2=driver.findElement(By.xpath("//table/tbody/tr["+j+"]/th")).getText();
		System.out.print(data2+" ");
	
		for(int k=1;k<=col.size();j++)
		{
			
		
		String data3=driver.findElement(By.xpath("//table//tr["+j+"]/td["+k+"]")).getText();
		System.out.println(data3+" ");
	}
	
	

	}

}
}
}
