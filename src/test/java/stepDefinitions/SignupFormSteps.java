package stepDefinitions;

import io.cucumber.java.en.*;

public class SignupFormSteps {

    @When("I fill in all fields")
    public void iFillInAllFields() {
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


    @Given("Incorrect {word}")
    public void incorrectInput(String input) {
        System.out.println("Given Incorrect " + input);
    }


    @When("I fill in only the required fields")
    public void iFillOnlyTheRequiredFields() {
        System.out.println("I fill only the required fields");
    }

    @Then("I can see {string} message")
    public void iCanSeeMessage(String incorrectUsername) {
        System.out.printf("I can see  \"%s\" message\n", incorrectUsername);
    }

    @But("I should not receive confirmation email")
    public void iShouldNotReceiveConfirmationEmail() {
        System.out.println("I should not receive confirmation email");
    }
}
