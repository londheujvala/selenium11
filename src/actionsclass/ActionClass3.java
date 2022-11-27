package actionsclass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass3 {

	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
driver.get("https://www.facebook.com/");
			
			Actions act = new Actions(driver);
			
		
			act.click(driver.findElement(By.id("email"))).keyDown(Keys.SHIFT).sendKeys(" Wlecome to Ktctc").keyUp(Keys.SHIFT).perform();
			
			
	 
	
	}

		
		}


