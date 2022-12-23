package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class Omayo {
	
	WebDriver driver = new ChromeDriver();


	public void invokeApp()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
		@Given("^I navigate to the application URL$")
		public void I_navigate_to_the_application_URL()
		{
			driver.get("http://omayo.blogspot.com");
			
		
		}
		
		@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the username and password fields$")
		public void I_enter_Username_as_someusername_and_Password_as_somepassword_into_the_username_and_password_fields(String username, String password)
		{
			System.out.println(username);
			System.out.println(password);
			driver.findElement(By.name("userid")).sendKeys(username);
			driver.findElement(By.name("pswrd")).sendKeys(password);
		}
		@And("^I click on the Login button now$")
		public void I_click_on_the_Login_button_now()
		{
			driver.findElement(By.xpath("//input[@value='Login']")).click();
		}
		

		@Then("^I the user should be successfully logged in$")
		public void I_the_user_should_be_successfully_logged_in()
		{
			String loginval = null;
			
			try
			{
			loginval = driver.getTitle();
			}catch(Exception e)
			{
				System.out.println("Exception handled");
			}
			
			/*	Assert.assertEquals(loginval, );
		if(Assert.(loginval,"Selenium143 "))
		{
		
			System.out.println("Successful Login");
		}*/
		}
		public void tearDown()
		{
			driver.quit();
		}

}
