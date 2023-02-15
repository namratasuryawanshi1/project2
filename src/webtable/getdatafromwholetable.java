package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromwholetable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
		Thread.sleep(2000);
		//get no.of rows
	int rowsize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
	System.out.println(rowsize);
	Thread.sleep(2000);
	////get no.ofcoloumn
	int col=driver.findElements(By.xpath("//table[@class=\"table\"]//tr[2]/td")).size();
	System.out.println(col);
	Thread.sleep(2000);
	//get heading of table
	for(int i=1;i<=col+1;i++)
	{
		String heading=driver.findElement(By.xpath("//table//thead//th["+i+"]")).getText();
		System.out.print(heading);
		
	}Thread.sleep(2000);
		System.out.println();
		
	for(int j=1;j<rowsize;j++)
	{
		String rowdata=driver.findElement(By.xpath("//table/tbody/tr["+j+"]/th")).getText();
		System.out.print(rowdata);
		
				
	
	  for(int k=1;k<col;k++)
	{
		String data=driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td["+k+"]")).getText();
		System.out.print(data+" ");
	}
	System.out.println();
	
	Thread.sleep(2000);
}

}
}
