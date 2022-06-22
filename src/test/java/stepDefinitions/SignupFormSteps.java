package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupFormSteps {

    @When("I fill in all required fields")
    public void iFillInAllRequiredFields() {
        System.out.println("When I fill in all required fields");
    }

    @And("I Click on submit button")
    public void iClickOnSubmitButton() {
        System.out.println("And I Click on submit button");
    }

    @Then("I have to receive confirmation email")
    public void iHaveToReceiveConfirmationEmail() {
        System.out.println("Then I have to receive confirmation email");
    }

    @And("Optional dummy text field with")
    public void optionalDummyTextFieldWith(String docString) {
        System.out.println("And Optional dummy text field with - " +
                "Doc String:\n" + docString + "\n");
    }

    @Given("Correct user data")
    public void correctUserData() {
        System.out.println("\nGiven Correct user data");
    }

    @And("I fill in the optional field")
    public void iFillInTheOptionalField() {
        System.out.println("And I fill in the optional field");
    }

    @Given("Incorrect username")
    public void incorrectUsername() {
        System.out.println("Given Incorrect username");
    }

    @And("Correct password and email")
    public void correctPasswordAndEmail() {
        System.out.println("And Correct password and email");
    }

    @Then("I can see {string} message")
    public void iHaveMessage(String incorrectUsername) {
        System.out.printf("Then I have \"%s\" message",incorrectUsername);
    }
}
