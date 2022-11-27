package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourthclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	     String data="Welcome to KTCTC'Hello'";
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.linkText("Facebook Lite")).click();
	     driver.findElement(By.partialLinkText("contact uploading and ")).click();
	}

}
