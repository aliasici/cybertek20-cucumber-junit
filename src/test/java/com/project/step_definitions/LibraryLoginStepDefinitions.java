package com.project.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("hi");

    }

    @When("logs in as librarian")
    public void logs_in_as_librarian() {
        System.out.println("bye");

    }
    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("good");

    }
    @When("User logs in as student")
    public void user_logs_in_as_student() {
        System.out.println("user logs in as student");

    }

    @When("User logs in as admin")
    public void user_logs_in_as_admin() {
        System.out.println("user logs in as admin");

    }


}
