package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CrudPageStepDefs {
////Before Hook Before all Test
//	@BeforeAll
//	public static void intializeApplucation() {
//		System.out.println("Initialize Application");
//	}
// //After Hook will perform after all Test
//	@AfterAll
//	public static void tearDown() {
//		System.out.println("Application Shutdown");
//	}
//	@Before("@RegressionTest")
//	public static void intializeApplucationinBeforeMethod() {
//		System.out.println("Initialize Application in BeforeMethod");	}
	
		
//	@Before(order=1)
//	public void readFromPropertyFile() {
//	    System.out.println("readFroMPropertyFile");}
//	@Before(order=2)
//	public void readFromDB() {
//	    System.out.println("readFromDB");}
//	@Before(order=3)
//	public void readFromBrowser() {
//	    System.out.println("readFromBrowser");}
	
	//Tags hooks with ordering
	@Before(value="@SmokeTest", order=1)
	public void readFromPropertyFileSmokeTest() {
	    System.out.println("readFromPropertyFileSmokeTest");}
	@Before(value="@SmokeTest", order=2)
	public void readFromDBSmokeTest() {
	    System.out.println("readFromDBSmokeTest");}
	@Before(value="@RegressionTest", order=1)
	public void readFromPropertyFileRegTest() {
	    System.out.println("readFromPropertyFileRegTest");}
	@Before(value="@RegressionTest", order=2)
	public void readFromDBRegTest() {
	    System.out.println("readFromDBRegTest");}
	
	
	@Given("User is on CRM Home Page")
	public void user_is_on_crm_home_page() {
	    System.out.println("User is on CRM Home Page");
	}
	@When("User Create New Contact")
	public void user_create_new_contact() {
	    System.out.println("User Create New Contact");
	}
	
	@When("User Update Contact")
	public void user_update_contact() {
		 System.out.println("User Update Contact");
	}
	
	@When("User Delete Contact")
	public void user_delete_contact() {
		System.out.println("User Delete Contact");
	}
	@When("User Create New Deals")
	public void user_create_new_Deals() {
	    System.out.println("User Create New Deals");
	}
	
	@When("User Update Deals")
	public void user_update_Deals() {
		 System.out.println("User Update Deals");
	}
	
	@When("User Delete Deals")
	public void user_delete_Deals() {
		System.out.println("User Delete Deals");
	}
	
	@When("User Create New Tasks")
	public void user_create_new_Tasks() {
	    System.out.println("User Create New Tasks");
	}
	
	@When("User Update Tasks")
	public void user_update_Tasks() {
		 System.out.println("User Update Tasks");
	}
	
	@When("User Delete Tasks")
	public void user_delete_Tasks() {
		System.out.println("User Delete Tasks");
	}
	
	@When("User Is on Login Page")
	public void user_Is_On_Login_Page() {
		System.out.println("User Is on Login Page");
	}
	@When("User Enters Credential")
	public void user_EntertsCredential() {
		System.out.println("User Enters Credential");
	}

}
