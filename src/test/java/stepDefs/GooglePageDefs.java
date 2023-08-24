package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		String title=driver.getTitle();
		System.out.println("The Page Title is  "+title);
		System.out.println("The Page Title is  "+driver.getCurrentUrl());
	}

}
