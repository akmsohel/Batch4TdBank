//package com.apiStepDef;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//public class GetApiStep {
//    String URL;
//
//    Response response;
//
//    @Given("I have added Valid URL and parameter")
//    public void iHaveAddedValidURLAndParameter() {
//        URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=pending";
//    }
//
//
//    @When("I send the Get request with valid headers")
//    public void iSendTheGetRequestWithValidHeaders() {
//        response = response = RestAssured.given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when().log().all().when()
//                .get(URL);
//    }
//
//    @Then("I validate the success response for get request")
//    public void iValidateTheSuccessResponseForGetRequest() {
//        response.then().statusCode(200);
//        response.then().log().all();
//
//    }
//
//
//    @Given("I have added Valid URL and parameter with sold status")
//    public void iHaveAddedValidURLAndParameterWithSoldStatus() {
//        URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=sold";
//    }
//
//    @Given("I have added Valid URL and parameter with available status")
//    public void iHaveAddedValidURLAndParameterWithAvailableStatus() {
//        URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";
//
//    }
//
//    @Given("I have added Valid URL but without status")
//    public void iHaveAddedValidURLButWithoutStatus() {
//        URL = "https://petstore.swagger.io/v2/pet/findByStatus";
//    }
//
//    @Given("I have added Valid URL and parameter with wrong status")
//    public void iHaveAddedValidURLAndParameterWithWrongStatus() {
//        URL = "https://petstore.swagger.io/v2/pet/findByStatus?status=jhs";
//
//    }
//
//    @Then("I validate the success response for wrong status get request")
//    public void iValidateTheSuccessResponseForWrongStatusGetRequest() {
//       response.then().statusCode(200);
//        response.then().log().all();
//    }
//
//    @Then("I validate the success response for get request without status")
//    public void iValidateTheSuccessResponseForGetRequestWithoutStatus() {
//        response.then().statusCode(200);
//        response.then().log().all();
//
//    }
//}