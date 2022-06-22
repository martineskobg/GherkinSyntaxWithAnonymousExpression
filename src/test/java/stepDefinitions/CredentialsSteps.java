package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CredentialsSteps {


    private List<Map<String, String>> credentials;

    @Given("users credentials")
    public void users_credentials(io.cucumber.datatable.DataTable dataTable) {
        credentials = dataTable.asMaps();

    }

    @When("I print user credentials")
    public void i_print_user_credentials() {
        for (Map<String, String> credential : credentials) {
            String username = credential.get("username");
            String password = credential.get("password");

            System.out.printf("\nUser %s has %s for password\n", username,password );
        }
    }

    @Then("I should see all user credentials on the console")
    public void i_should_see_all_user_credentials_on_the_console() {

    }

}
