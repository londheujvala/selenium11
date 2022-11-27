package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	   System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Welcome to KTCTC");
	driver.findElement(By.id("email")).sendKeys("Wlecome to KTCTC");
	WebElement passTestBox=driver.findElement(By.name("pass"));
	

	passTestBox.sendKeys("KT12345");
	passTestBox.sendKeys("sample");
	driver.findElement(By.name("login")).click();
	
	
	}

}
