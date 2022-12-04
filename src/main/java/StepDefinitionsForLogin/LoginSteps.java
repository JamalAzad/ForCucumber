package StepDefinitionsForLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is in login page")
    public void userIsInLoginPage() {
        System.out.println("Inside Step (Given): User is on Login page.");

    }
    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        System.out.println("Inside Step (When): User enters login credentials:");

    }
    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("Inside Step (And): User clicks  on login button.");

    }
    @Then("user is navigated to Home Page")
    public void userIsNavigatedToHomePage() {
        System.out.println("Inside Step (Then): User navigates to Home Page.");
    }

}
