package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageDefs {
	WebDriver driver;
	@Given("User is On Google Page")
	public void user_is_on_searchPage()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	@When("I Search For Java Tutorial")
	public void I_Search_For_Java_Tutorial()
	{
		WebElement webelement=driver.findElement(By.id("APjFqb"));
		webelement.sendKeys("Java Tutorial");
		webelement.sendKeys(Keys.ENTER);
	
	}
	@Then("Should Displayed Java Search Page")
	public void Should_Displayed_Java_Search_Page()
	{
		String subtitle=driver.getTitle();
		Assert.assertEquals(subtitle, "Java Tutorial - Google Search");
	}
	
	
	@When("I Search For Selenium Tutorial")
	public void I_Search_For_Selenium_Tutorial()
	{
		WebElement webelement=driver.findElement(By.id("APjFqb"));
		webelement.sendKeys("Selenium Tutorial");
		webelement.sendKeys(Keys.ENTER);
	
	}
	@Then("Should Displayed Selenium Search Page")
	public void Should_Displayed_Selenium_Search_Page()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Selenium Tutorial - Google Search");
	}

}
