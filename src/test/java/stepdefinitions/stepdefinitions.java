package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileWriter;
import java.io.IOException;

public class stepdefinitions {
    int a, b, c;
    @When("^I have a$")
    public void i_have_a() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("First #1");
        a = 5;
        System.out.println("A : "+a);
        FileWriter writer = new FileWriter("MyFile.txt", true);
        writer.write("I have a");
        writer.write("\r\n");   // write new line

    }

    @When("^I have b$")
    public void i_have_b() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Second #2");
        b = 10;
        System.out.println("A : "+b);
        FileWriter writer = new FileWriter("MyFile.txt", true);
        writer.write("I have b");
        writer.write("\r\n");   // write new line
    }

    @Then("^display sum$")
    public void display_sum() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sum #3");
        c = a+b;
        System.out.println("Sum : "+c);

        FileWriter writer = new FileWriter("MyFile.txt", true);
        writer.write("I have Sum");
        writer.write("\r\n");   // write new line

    }

    @Then("^display multiplication$")
    public void display_multiplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Multiplication #4");
        c = a*b;
        System.out.println("Multiplication : "+c);

        FileWriter writer = new FileWriter("MyFile.txt", true);
        writer.write("I have Multiplication");
        writer.write("\r\n");   // write new line
    }
    @Then("^display division$")
    public void display_division() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Division #5");
        c = b/a;
        System.out.println("Division : "+c);

        FileWriter writer = new FileWriter("MyFile.txt", true);
        writer.write("I have Division");
        writer.write("\r\n");   // write new line
    }

}
