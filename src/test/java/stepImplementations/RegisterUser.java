package stepImplementations;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import actionsOnWebPage.SignInPageAction;

public class RegisterUser {
	
	@Given("^Sign in is visible in$")
	public void givenStatement() {
		//SignInPageAction.clickOnSignIn();
		System.out.println("Given printed");
	}
	@When("^Click on Sign in button$")
	public void whenStatement() {
		System.out.println("When statement executed");
	}
	@Then("^Authentication Page is displayed$")
	public void thenStatement() {
		System.out.println("Then statement executed");
	}
	@And("^User enters valid email ID$")
	public void andStatement() {
		System.out.println("And statement executed");
	}
	@And("^Clicks on Create Account Button$")
	public void and2Statement() {
		System.out.println("And 2 statement executed");
	}
	
}

