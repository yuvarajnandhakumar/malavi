package amazon.stepdefinition;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	public static WebDriver driver;
	
	@Given("Launches application")
	public void launches_application() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			}

	@Then("Verifies url")
	public void verifies_url() {
		driver.get("https://www.amazon.in/");
	   
	}

	

	@Then("user enter {string} and {string}")
	public void user_enter_and(String uname, String password) throws InterruptedException {
	  
		//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("email")).sendKeys(uname);
		System.out.println("username for "+uname +"  is entered");
		System.out.println("cucumber demo is completed");
		
	}


	
	

}
