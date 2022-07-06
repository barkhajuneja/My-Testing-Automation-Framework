package stepdefs;

import StepClasses.UITestClass;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoDefinitions {

    UITestClass uiTests;
    @Before
    public void before_class()
    {
        uiTests = new UITestClass();
    }

    @Given("^Open Google Chrome and launch the application$")
    public void Open_Google_Chrome_and_launch_the_application() throws Exception {
        uiTests.openBrowser();

    }

    @When("^Enter the website address \"([^\"]*)\"$")
    public void enter_the_website_address(String site )  {
        uiTests.openSite(site);
    }

    @When("^I choose the Electronics department$")
    public void i_choose_the_department()  {
        uiTests.navigate_to_home_page_and_choose_electronics();

    }

    @Then("^'HeadPhones' should be listed Top Selling Electronics$")
    public void headphones_should_be_listed_Top_Selling_Electronics() throws Exception {
        uiTests.headphones_should_be_listed_Top_Selling_Electronics();

    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        uiTests.close_the_browser();
    }


}
