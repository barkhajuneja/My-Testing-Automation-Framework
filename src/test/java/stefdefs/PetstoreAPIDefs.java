package stepdefs;

import RestClasses.APITestClass;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.BeforeClass;

public class PetstoreAPIDefs {

    JsonPath jsonPathEvaluator;
    APITestClass rs;

    @Before
    public void before_Scenario(){
        rs = new APITestClass();
    }

    @Given("Find Pet By Id")
    public void Find_Pet_By_Id() throws Exception {

            Response response =rs.getMethod();
           jsonPathEvaluator = response.jsonPath();
            System.out.println("Pet Id is = "+jsonPathEvaluator.get("id"));

    }

       @When("Update Pet Name")
    public void Update_Pet_Name() throws Exception {

             rs.putMethod();

    }

    @Then("Delete a pet")
    public void Delete_a_Pet() throws Exception {

        rs.deleteMethod();

    }

}
