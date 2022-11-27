package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemoQA2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://demoqa.com/select-menu");
driver.findElement(By.xpath("//*[contains(text(),'Select Option')]")).click();

	driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]")).click();
		
	}
}
