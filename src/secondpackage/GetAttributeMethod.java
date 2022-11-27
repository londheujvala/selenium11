package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\users\\dell\\downloads\\chromedriver_win32\\chromedriver.exe");
      
		ChromeDriver driver=new ChromeDriver();
      
		driver.get("https://www.facebook.com/");
      
       WebElement emailTextBox=driver.findElement(By.id("email"));
       
       emailTextBox.sendKeys("Welcome to Ktctc");
      
       String msg=emailTextBox.getAttribute("value");
      
       System.out.println(msg);
       
	}

}
