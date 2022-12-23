package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 public class TestNGDemo {
	
	    private static WebDriver driver;       
	    public final static int TIMEOUT = 10;
	     
	    @Before
	    public void setUp() {
	 
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	        driver.manage().window().maximize();
	    }
	 
	    @Given("User is on HRMLogin page {string}")
	    public void loginTest(String url) {
	         
	        driver.get(url);
	  
	    }
	  
	    @When("User enters username as {string} and password as {string}")
	    public void goToHomePage(String userName, String passWord) {
	  
	        // login to application
	    	System.out.println(userName);
	    	System.out.println(passWord);
	        driver.findElement(By.name("username")).sendKeys(userName);
	        driver.findElement(By.name("password")).sendKeys(passWord);      
	        driver.findElement(By.xpath("//button[@type='submit']")).submit();
	  
	        // go the next page
	         
	    }
	     
	    @Then("User should be able to login sucessfully and new page open")
	    public void verifyLogin() {
	  
	         String dashboardMenu = driver.findElement(By.xpath("//a[contains(@href,'dashboard')]/span")).getText();
	          
	         //Verify new page - HomePage
	         Assert.assertEquals(dashboardMenu,"Dashboard");
	         System.out.println("login sucessful and new page open with dashboard menu on the left menu bar");
	  
	    }
	     
	    @Then("User should be able to see error message {string}")
	    public void verifyErrorMessage(String expectedErrorMessage) {
	  
	        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/div[1]/div/div/p")).getText();
	         
	        // Verify Error Message
	        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
	  
	    }
	     
	    @After
	    public void teardown() {
	  
	        driver.quit();
	    }
	       
	}


