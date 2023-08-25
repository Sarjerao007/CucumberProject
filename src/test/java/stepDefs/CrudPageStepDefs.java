package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CrudPageStepDefs {
	
	
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

}
