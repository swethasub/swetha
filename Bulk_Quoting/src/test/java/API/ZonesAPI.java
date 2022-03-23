package API;

import POJO.getZonesInput;
import POJO.getZonesOutput;
import StepDefinition.StepDefinition;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ZonesAPI  {

    public static getZonesOutput sendRequest(getZonesInput input) {

            String theRestApiBaseUrl;
            theRestApiBaseUrl = "http://lcoa-q1ld-xws1.autodatacorp.org:8080/bulk-quoting-service-1.0/";

             Response response =RestAssured.given()
                    .baseUri(theRestApiBaseUrl).basePath("/getZones/{country}/{division}/{modelYear}")
                    .header("Content-Type", "application/json", "chrome_appId", "autodata-4NWmhQDSoIFsr5CmjUVVMxu6ocNFfqUCOk6Uygqv", "chrome-productkey", "BULKQUOTINGV1")
                    .queryParam("dealerId=", "123")
                    .pathParams("country", input.getCountry(),
                            "division", input.getDivision()).get();
        ObjectMapper mapper= new ObjectMapper();
        try{
            return mapper.readValue(response.jsonPath().prettyPrint(), getZonesOutput.class);

        }catch (Exception e){
            return null;
        }



    }
}
