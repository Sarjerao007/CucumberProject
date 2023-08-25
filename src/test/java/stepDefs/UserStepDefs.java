package stepDefs;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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
	//Parameterization
	@When("User Enters {string} and {string}")
	public void user_enters_and(String User, String Pass) {
	    
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(User);
		
	driver.findElement(By.id("password")).sendKeys(Pass);
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}
	
	//DataTable as a List
	@When("User Enters credentialss")
	public void user_enters_credentialss(DataTable datatable) {
		List<List<String>> data=datatable.asLists();
		String strUser=data.get(0).get(0);
		String strPass= data.get(0).get(1);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPass);
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}
	
	//DataTable as a Map
	@When("User Enters credentialsss")
	public void user_enters_credentialsss(DataTable datatable) {
		List<Map<String,String>> data=datatable.asMaps();
		String strUser=data.get(0).get("Username");
		String strPass= data.get(0).get("Password");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPass);
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}
	
	//Datatable Pass more than one set of data
	@When("User Enters credentialssss")
	public void user_enters_credentialssss(DataTable datatable) {
		List<Map<String,String>> data=datatable.asMaps();
		data.size();
		String strUser=data.get(0).get("Username");
		String strPass= data.get(0).get("Password");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPass);
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	}

}
