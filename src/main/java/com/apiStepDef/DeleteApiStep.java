//package com.apiStepDef;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//public class DeleteApiStep {
//    String URL;
//    String payload;
//    Response response;
//
//    @Given("I have added Valid URL and parameter id for Delete request")
//    public void iHaveAddedValidURLAndParameterIdForDeleteRequest() {
//        URL = "https://petstore.swagger.io/v2/pet/11";
//
//    }
//
//    @When("I send the Delete request with valid headers")
//    public void iSendTheDeleteRequestWithValidHeaders() {
//        response = RestAssured.given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when().log().all().when()
//                .delete(URL);
//
//
//    }
//
//    @Then("I validate the success response for Delete request")
//    public void iValidateTheSuccessResponseForDeleteRequest() {
//        response.then().statusCode(404);
//        response.then().log().all();
//    }
//
//
//    @Given("I have added Valid URL and wrong id for Delete request")
//    public void iHaveAddedValidURLAndWrongIdForDeleteRequest() {
//        URL = "https://petstore.swagger.io/v2/pet/1111";
//
//    }
//
//    @Then("I validate the success response with wrong id for Delete request")
//    public void iValidateTheSuccessResponseWithWrongIdForDeleteRequest() {
//         response.then().statusCode(404);
//        response.then().log().all();
//
//    }
//}