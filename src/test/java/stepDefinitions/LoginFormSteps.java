package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginFormSteps {
    @Given("Correct username and password")
    public void correctUsernameAndPassword() {
        System.out.println("Given Correct username and password");
    }

    @When("I Click on login button")
    public void iClickOnLoginButton() {
        System.out.println("I Click on login button");
    }

    @Then("I should see {} message")
    public void iShouldSeeMessage(String message) {
        System.out.printf("I should see %s message\n", message);
    }

    @And("User is an {}")
    public void userIs(String typeOfUser) {
        System.out.printf("\nGiven %s user\n", typeOfUser);
    }

    @Given("Incorrect {} field")
    public void incorrectField(String incorrect_field) {
        System.out.printf("\nGiven Incorrect %s field\n", incorrect_field);
    }

}
