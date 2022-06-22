package stepDefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFormSteps {
    @Given("Correct username and password")
    public void correctUsernameAndPassword() {
        System.out.println("Given Correct username and password");
    }

    @Given("Ordinary user")
    public void ordinaryUser() {
        System.out.println("Given Ordinary user");
    }

    @When("I Click on login button")
    public void iClickOnLoginButton() {
        System.out.println("I Click on login button");
    }

    @Then("I should see {} message")
    public void iShouldSeeMessage(String message) {
        System.out.printf("I should see %s message\n", message);
    }

    @But("I should not see the admin section")
    public void iShouldNotSeeTheAdminSSection() {
        System.out.println("I should not see the admin section");
    }


    @Given("Admin user")
    public void adminUser() {
        System.out.println("Given Admin user");
    }

    @Then("I can see the admin section")
    public void iCanSeeTheAdminSSection() {
        System.out.println("I can see the admin section");
    }

    @Given("Incorrect {} Or {}")
    public void incorrectUsernameOrPassword(String username, String password) {
        System.out.printf("Given username = %s and password = %s\n", username, password);
    }

}
