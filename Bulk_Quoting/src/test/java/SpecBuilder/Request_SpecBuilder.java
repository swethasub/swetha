/*package SpecBuilder;


import POJO.getZonesInput;
import io.cucumber.messages.types.StepDefinition;
import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;


public class Request_SpecBuilder extends StepDefinition  {

    protected static String getTheRestApiBaseUrl() {

        String theRestApiBaseUrl;
        theRestApiBaseUrl = "http://lcoa-q1ld-xws1.autodatacorp.org:8080/bulk-quoting-service-1.0/";

        RequestSpecification request = RestAssured.given()
                .baseUri(theRestApiBaseUrl).basePath("/getZones")
                .header("Content-Type", "application/json", "chrome_appId", "autodata-4NWmhQDSoIFsr5CmjUVVMxu6ocNFfqUCOk6Uygqv", "chrome-productkey", "BULKQUOTINGV1")
                .queryParam("dealerId=", "123");

        return theRestApiBaseUrl;
    }


    }

}*/

