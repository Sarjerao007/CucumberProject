package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendEmailDefs {
	WebDriver driver;
	@Given("User must launch the application")
	public void User_must_launch_application()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/samplepagetest/");
	}
	@When("user should send email")
	public void user_should_send_email() {
	driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("docString");
	
	}
}
