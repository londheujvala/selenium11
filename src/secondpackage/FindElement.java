package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\dell\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement textBox=driver.findElement(By.xpath("//form//div/input"));
	textBox.sendKeys("welcome to Ktctc");
	
	}

}
