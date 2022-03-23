package StepDefinition;

import API.ZonesAPI;
import POJO.getZonesInput;
//import SpecBuilder.Request_SpecBuilder;
import POJO.getZonesOutput;
import com.fasterxml.jackson.databind.node.POJONode;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class StepDefinition  {

       private EnvironmentVariables environmentVariables;
       private Actor Swetha;
       protected String theRestApiBaseUrl;
       private String request;
       private Actor Request;
       public getZonesInput input;

       @Given("Swetha sends request to the Bulk Quoting Service for a {string},{string},{string}")
       public void swetha_sends_request_to_the_bulk_quoting_service_for_a(String Country, String Division, String Modelyear) {
           OnStage.setTheStage(new OnlineCast());
           getZonesInput Input=new getZonesInput(Country, Division, Modelyear);
           theActorInTheSpotlight().remember("zonesInput", Input);
              Input=new getZonesInput(Country, Division, Modelyear);



       }


             @When("they send a getzones request")
              public void they_send_a_get_zones_request()
              {
                  getZonesInput input = theActorInTheSpotlight().recall("zonesInput");
                 // RequestSpecification request = Request_SpecBuilder.sendRequest(input);
                  getZonesOutput output = ZonesAPI.sendRequest(input);



              }

              @Then("list of available zoneGuids should get displayed")
              public void list_of_available_zone_guids_should_get_displayed() {
                     Swetha.should(
                             seeThatResponse("all the expected users should be returned",
                                     response -> response.statusCode(200)));

              }}









