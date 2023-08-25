package stepDefs;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDefs {
	WebDriver driver;
	@Given("User is on Login")
	public void user_is_on_login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-Internet.herokuapp.com/login");

	}
	@When("User Enters credentials")
	public void user_enters_credentials() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
	
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}
	@Then("User Should Be Navigated to Homepage")
	public void user_should_be_navigated_to_homepage() {
	   boolean Isvalid=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   assertTrue(Isvalid);
	    
	}
	
	@When("User Enters {string} and {string}")
	public void user_enters_and(String User, String Pass) {
	    
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(User);
		
	driver.findElement(By.id("password")).sendKeys(Pass);
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}

}
