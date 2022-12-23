package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	RemoteWebDriver driver = new ChromeDriver();
	
	@Given("^I access OmayoBlogSpot Application$")
	public void I_access_OmayoBlogSpot_Application()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/");
			
	}
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void I_enter_Username_as_someusername_and_Password_as_somepassword_into_the_fields(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
	}
	
	@And("^I click on the Login Button$")
	public void I_click_on_the_Login_Button()
	{
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("^I the user should be able to successfully login$")
	public void I_the_user_should_be_able_to_successfully_login()
	{
		System.out.println("Successful Login");
	}
	

			
	
}
