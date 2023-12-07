package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.MavinHomePracticeBsaeClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkingpriceoftoyota extends MavinHomePracticeBsaeClass{
	
	
	
	@Given("I am on Toyota homepage")
	public void i_am_on_toyota_homepage() {
		
		launchbrowser();
		
		}

	@When("I Click on Vehicles button")
	public void i_click_on_vehicles_button() {
		
		WebElement searchbutton = driver.findElement(By.id("tabbed-container-v2-82bc5d859e-item-ef3778069a-tab"));
		searchbutton.click();
		
	    
	}

	@When("I click on Camry2024")
	public void i_click_on_camry2024() {
		
		WebElement clickbutton = driver.findElement(By.className("slide-img-link"));
		clickbutton.click();
	    
	}

	@Then("I see relevant result")
	public void i_see_relevant_result() {
		
		String title = driver.getTitle();
		System.out.println("***********************");
		System.out.println(title);
		System.out.println("************************");
		
		Assert.assertEquals(title,"2024 Toyota Crown | Toyota.com");
		
		
		
		
		WebElement searchresult = driver.findElement(By.className("price"));
		String result = searchresult.getText();
		System.out.println("********************");
		System.out.println(result);
		System.out.println("*********************");
		
		
		
		
		
		
		
		closebrowser();
	   
	}



	
	
	

}
