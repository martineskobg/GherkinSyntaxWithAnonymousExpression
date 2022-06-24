package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StudentsSteps {
    private List<String> studentNames;

    @Given("Student names as Data Table")
    public void student_names_as_data_table(DataTable dataTable) {
        studentNames = dataTable.asList();
    }

    @When("I print all names from the data table")
    public void i_print_all_names_from_the_data_table() {
        for (String stName : studentNames) {
            System.out.println(stName);
            if (stName.equals("Student Name")){
                System.out.println("------------");
            }
        }
    }

    @Then("I should see all names")
    public void i_should_see_all_names() {
        System.out.println("\nI see all student names");
    }
}
