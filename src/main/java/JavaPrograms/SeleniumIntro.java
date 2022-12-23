package JavaPrograms;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File file = new File("D\\test.txt");
		
	//	System.setProperty("webdriver.chrome.driver","D:\\Revathy\\TechTraining\\Automation\\FirstProject\\CBDDDemo\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.className("gLFyf"));
		ele.sendKeys("testing");
		ele.sendKeys(Keys.ENTER);
		if(driver.getTitle().equals("testing - Google Search"))
				{
				System.out.println("Pass");
				}
		
	}

}
