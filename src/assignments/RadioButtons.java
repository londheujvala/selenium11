package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//*[contains(text(),'Yes')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Impressive')]")).click();
			
				
	}

}
