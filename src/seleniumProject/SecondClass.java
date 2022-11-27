package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
       System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By em=By.id("email");
		WebElement emailTextBox=driver.findElement(em);
		emailTextBox.sendKeys("Welcome to KTCTC");
		By ps=By.name("login");
		WebElement passTestBox=driver.findElement(ps);
		passTestBox.sendKeys("KT12345");
		By bt =By.name("login");
		WebElement loginButton=driver.findElement(bt);
		
		loginButton.click();
		
		
		
	}

}
