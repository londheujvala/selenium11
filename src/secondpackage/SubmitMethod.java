package secondpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\\\users\\\\dell\\\\downloads\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("KTCTC");
		driver.findElement(By.name("pass")).sendKeys("KT1234");
		driver.findElement(By.name("login")).submit();
	}

}
