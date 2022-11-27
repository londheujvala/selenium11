package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","c:\\\\users\\\\dell\\\\downloads\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String fontFan=driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect')]")).getText();
	System.out.println(fontFan);
	
	
	}

}
