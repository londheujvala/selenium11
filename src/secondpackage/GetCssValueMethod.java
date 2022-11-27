package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","c:\\\\users\\\\dell\\\\downloads\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement Text=driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect')]"));
	
	String fontFan=Text.getCssValue("font-family");
	
	System.out.println(fontFan);
	
	System.out.println(Text.getCssValue("font-size"));
	System.out.println(Text.getCssValue("color"));
	System.out.println(Text.getCssValue("background-color"));
	
	}

}
