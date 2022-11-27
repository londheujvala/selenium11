package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\users\\dell\\downloads\\chromedriver_win32\\chromedriver.exe");
      
		ChromeDriver driver=new ChromeDriver();
      
		driver.get("https://www.facebook.com/");
      
      
       String msg=driver.findElement(By.id("email")).getAttribute("placeholder");
      
       System.out.println(msg);
       
	}

}
