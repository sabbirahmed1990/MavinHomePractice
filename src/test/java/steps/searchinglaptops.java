package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.MavinHomePracticeBsaeClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchinglaptops extends MavinHomePracticeBsaeClass {
	@Given("I am on BestBuy homepage")
	public void i_am_on_best_buy_homepage() {
		
		launchbrowser1();
	    
	}

	@When("I click on search Box")
	public void i_click_on_search_box() {
		
		WebElement searchbox = driver.findElement(By.name("st"));
		searchbox.sendKeys("LapTops");
	    
	}

	@When("I write Laptops on search box")
	public void i_write_laptops_on_search_box() {
	    
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
		WebElement searchbutton = driver.findElement(By.className("header-search-button"));
		searchbutton.click();
	    
	}

	@Then("I find relevant result")
	public void i_find_relevant_result() {
		
		
		String title = driver.getTitle();
		System.out.println("************************");
		System.out.println(title);
		System.out.println("*************************");
		
		Assert.assertEquals(title,"laptops - Best Buy");
		
		
		
		
	    WebElement searchresult = driver.findElement(By.className("item-count"));
	    String result = searchresult.getText();
	    System.out.println("************************");
	    System.out.println(result);
	    System.out.println("*************************");
	
	
	
	closebrowser();
	
	
	}



	

}
