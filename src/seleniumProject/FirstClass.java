package seleniumProject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver dri = new EdgeDriver();
		
		ChromeDriver dd = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		dri.get("https://demoqa.com/text-box");
		
		dd.get("https://demo.automationtesting.in/Register.html");
		
		driver.close();
		dri.close();
		dd.close();

	}

}
