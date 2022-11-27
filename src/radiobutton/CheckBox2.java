package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\dell\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	
	
	WebElement checkbox= driver.findElement(By.xpath("//*[@value='checkbox1']"));
	  
	System.out.println(checkbox.isDisplayed());
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());
	
	checkbox.click();
	System.out.println(checkbox.isDisplayed());
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());
	
	}
	public static void checkOrUncheckCHeckBox(WebDriver driver, By loc, boolean checkuncheck)
	{
		
	}


}
