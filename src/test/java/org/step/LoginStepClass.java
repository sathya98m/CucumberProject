package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepClass extends BaseClass {
	
	public static BaseClass b = new BaseClass();
	public static LoginPage l;
	@Given("User sholud be Login WebPage")
	public void user_sholud_be_login_web_page() {
		try {
			b.getDriver(b.readExcell(0, 2));
			b.getUrl(b.readExcell(1, 3));
			b.winMax();
			System.out.println("Browser & URL Launched Successfully");
		} catch (Exception e) {
			System.out.println("Browser & URL Launched Not Successfully");		}
	   
	}
	@When("User should Enter Login Credentials")
	public void user_should_enter_login_credentials() {
		try {
			l=new LoginPage();
			l.getUsername().sendKeys(b.readExcell(3, 0));
			l.getPassword().sendKeys(b.readExcell(3, 1));
			System.out.println("Credentials are Entered Successfully");
		} catch (Exception e) {
			System.out.println("Credentials are Entered not Successfully");
		}
	    
	}
	@When("User should Click Login button")
	public void user_should_click_login_button() {
		try {
		l=new LoginPage();
		l.getLogin().click();
		System.out.println("Login button clicked Successfully");
		}catch (Exception e) {
			System.out.println("Login button clicked not Successfully");
		} 
	}
	@Then("User should verify success login")
	public void user_should_verify_success_login() {
		try {
			SearchHotelPage s = new SearchHotelPage();
			WebElement location = s.getLocation();
			if (location.isDisplayed()) {
				System.out.println("Search hotel page is successfully displayed");
				
			} else {
				System.out.println("Search hotel page is successfully not displayed");

			}
			
		} catch (Exception e) {
			System.out.println();
		}
	    
	}


}
