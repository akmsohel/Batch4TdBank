package com.pojoPetApiStepDef;

import com.pojo.Pet.AddPet;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutPetPojoStep {
    String URL;
    String editedPayload;
    Response response;
    public static AddPet addPet;



    @When("I send the Put request with valid headers")
    public void iSendThePutRequestWithValidHeaders() {

        URL="https://petstore.swagger.io/v2/pet";
        response = RestAssured.given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(addPet).when().log().all()
                .put(URL);
    }
    }

