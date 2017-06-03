package com.ecvictor.selenium.cucumber.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import com.ecvictor.selenium.cucumber.helpers.Log;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;


public class BlankStepDefs {
    public WebDriver driver = Hooks.driver;

    public BlankStepDefs() {
        Log.startTestCase(BlankStepDefs.class.getName());
    }

    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.seleniumframework.com");
    }


    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.", driver.getTitle());
        assertEquals("http://www.seleniumframework.com/", driver.getCurrentUrl());
    }

}