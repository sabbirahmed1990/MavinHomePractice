package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavinHomePracticeBsaeClass {
	
	   public WebDriver driver;
	
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.toyota.com");
		driver.manage().window().maximize();
		
		}
	
	public void launchbrowser1() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("https://www.BestBuy.com");
		driver.manage().window().maximize();
		
		
	}
	
	
	public void closebrowser() {
		
		driver.close();
	}

}
