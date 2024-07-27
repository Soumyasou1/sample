package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
			   
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to Home page")
	public void user_should_be_navigated_to_home_page() {
	   Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"user is navigated to Home page");
	 
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.close();
	}



}
