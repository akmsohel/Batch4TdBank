package com.pojoPetApiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GetPetStatusStep {
    Response response;
    String url;



    @When("^I send the Get request with status (.*)$")
    public void iSendTheGetRequestWithStatusValue(String status) {
        url="https://petstore.swagger.io/v2/pet/findByStatus";
        response= RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("status", status)
                .when().log().all()
                .get(url);
        response.then().log().all();


    }

//    @Then("I validate the success response for get pet by status")
//    public void iValidateTheSuccessResponseForGetPetByStatus(String status ) {
//        response.then().statusCode(200);
//       // response.then().log().all();
//
//        if(status.equals("invalid")){
//            Assert.assertTrue(((List)response.body().path("")) .size()==0);
//
//        }else {
//            List jsonList = response.body().path("");
//
//            Map json = (Map) jsonList.get(0);
//            Assert.assertTrue(jsonList.size()>=1);
//            Assert.assertNotNull(json.get("id"));
//            Assert.assertNotNull(json.get("name"));
//            Assert.assertNotNull(json.get("photoUrl"));
//            Assert.assertNotNull(json.get("category"));
//            Assert.assertNotNull(json.get("status"));
//
//        }
  //  }


    @When("^I send the Get request with status (|available|pending|sold|)$")
    public void iSendTheGetRequestWithStatusAvailablePendingSold(String status) {
        url="https://petstore.swagger.io/v2/pet/findByStatus";
        response= RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("status", status)
                .when().log().all()
                .get(url);
        response.then().log().all();

    }

    @When("^I send the Get request with invalid status (.*)$")
    public void iSendTheGetRequestWithInvalidStatusValue(String status) {

        url="https://petstore.swagger.io/v2/pet/findByStatus";
        response= RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("status", status)
                .when().log().all()
                .get(url);
        response.then().log().all();


    }
    }



