//package com.apiStepDef;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import org.testng.Assert;
//
//public class PutApiStep {
//    String URL;
//    String editedPayload;
//    Response response;
//
//    @Given("I have added Valid URL and valid edited payload")
//    public void iHaveAddedValidURLAndValidEditedPayload() {
//        URL = "https://petstore.swagger.io/v2/pet";
//        editedPayload="{\n" +
//                "  \"id\": 113,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 129,\n" +
//                "    \"name\": \"string12\"\n" +
//                "  },\n" +
//                "  \"name\": \"dogie\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"string\"\n" +
//                "  ],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 20,\n" +
//                "      \"name\": \"kalu\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
//
//    }
//
//    @When("I send the Put request with valid headers")
//    public void iSendThePutRequestWithValidHeaders() {
//        response = RestAssured.given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when()
//                .body(editedPayload)
//                .when().log().all().when()
//                .put(URL);
//
//    }
//
//    @Then("I validate the success response for Put request")
//    public void iValidateTheSuccessResponseForPutRequest() {
//        response.then().statusCode(200);
//        response.then().log().all();
//
//        Assert.assertEquals((int)response.body().path("id"),113);
//        Assert.assertEquals((int)response.body().path("category.id"),129);
//        Assert.assertEquals((int)response.body().path("tags[0].id"),20);
//
//    }
//
//    @Given("I have added Valid URL and existing payload")
//    public void iHaveAddedValidURLAndExistingPayload() {
//        URL = "https://petstore.swagger.io/v2/pet";
//        editedPayload="{\n" +
//                "  \"id\": 113,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 129,\n" +
//                "    \"name\": \"string12\"\n" +
//                "  },\n" +
//                "  \"name\": \"dogie\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"string\"\n" +
//                "  ],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 20,\n" +
//                "      \"name\": \"kalu\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
//    }
//
//    @Then("I validate the success response for Put request edited existing payload")
//    public void iValidateTheSuccessResponseForPutRequestEditedExistingPayload() {
//      response.then().statusCode(200);
//        response.then().log().all();
//    }
//
//
//}