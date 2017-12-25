package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions {
    @When("^I have a$")
    public void i_have_a() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("First #1");
    }

    @When("^I have b$")
    public void i_have_b() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Second #2");
    }

    @Then("^display sum$")
    public void display_sum() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sum #3");
    }

    @Then("^display multiplication$")
    public void display_multiplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Multiplication #4");
    }
    @Then("^display division$")
    public void display_division() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Division #5");
    }

}
