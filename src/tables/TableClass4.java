package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableClass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe"); 

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allname= driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]/a"));
	  for(WebElement each:allname) {
		  System.out.println(each.getText());
		  
	  }
	  List<WebElement> allcprice= driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
	  for(WebElement each:allcprice) {
		
		  
		  
		  System.out.println(each.getText());}
	  }

	}


