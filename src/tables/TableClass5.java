package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableClass5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allname= driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
	  for(WebElement each:allname) {
		  String cName=each.findElement(By.xpath("//td[1]/a")).getText();
		  System.out.println(cName);
		  String cntPrice=each.findElement(By.xpath("//td[4]")).getText();}
	  System.out.println("after for loop");
		  
	  }
	 

	}


