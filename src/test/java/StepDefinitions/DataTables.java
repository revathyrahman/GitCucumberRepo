package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTables {
		
		WebDriver driver = new ChromeDriver();
			
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("http://omayo.blogspot.com");
		}

		@When("^User Navigate to LogIn fields$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
			System.out.println("Login fields in the home page");
		}
/*
		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
			
			List<List<String>> data = usercredentials.asLists();
		
			System.out.println(data.get(0).get(0));
			System.out.println(data.get(0).get(1));
			driver.findElement(By.name("userid")).sendKeys(data.get(0).get(0)); 
			driver.findElement(By.name("pswrd")).sendKeys(data.get(0).get(1));
			
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
		}
*/
		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
			
			List<Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
			
	        for (Map<String, String> form : data) {
	 
	            String userName = form.get("username");
	            System.out.println("Username :" + userName);
	            driver.findElement(By.name("userid")).clear();
	        	driver.findElement(By.name("userid")).sendKeys(userName);
	 
	            String passWord = form.get("password");
	            System.out.println("Password :" + passWord);
	            driver.findElement(By.name("pswrd")).clear();
	            driver.findElement(By.name("pswrd")).sendKeys(passWord);
	        	 	 
	    		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    	
	    		 driver.switchTo().alert().accept();
		}
		}
		
		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			System.out.println("Login Successfully");
		}


	}

