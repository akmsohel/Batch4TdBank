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
//public class PostApiStep {
//    String URL;
//    String payload;
//    String mandatoryPayload;
//    Response response;
//
//    @Given("I have added Valid URL and valid payload")
//    public void i_have_added_Valid_URL_and_valid_payload() {
//        URL = "https://petstore.swagger.io/v2/pet";
//
//        payload = "{\n" +
//                "  \"id\": 50,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 19,\n" +
//                "    \"name\": \"Browny\"\n" +
//                "  },\n" +
//                "  \"name\": \"dogy\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"https://imgur.com/a/uvVbEf1\"],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 88,\n" +
//                "      \"name\": \"Brown1\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
//    }
//
//    @When("I send the POST request with valid header")
//    public void iSendThePOSTRequestWithValidHeader() {
//        response = RestAssured.given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when()
//                .body(payload)
//                .when().log().all().when()
//                .post(URL);
//    }
//
//    @Then("I validate the success response")
//    public void iValidateTheSuccessResponse() {
//        response.then().statusCode(200);
//        response.then().log().all();
//        Assert.assertEquals((int)response.body().path("id"),50);
//        Assert.assertEquals((int)response.body().path("category.id"),19);
//        Assert.assertEquals((int)response.body().path("tags[0].id"),88);
//
//    }
//
//    @Given("I have added Valid URL and mandatory valid data")
//    public void iHaveAddedValidURLAndMandatoryValidData() {
//        URL = "https://petstore.swagger.io/v2/pet";
//        mandatoryPayload="{\n" +
//                "  \n" +
//                "  \"name\": \"dogy\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"https://imgur.com/a/uvVbEf1\"]\n" +
//                "}\n";
//    }
//    @When("I send the POST request with valid headers")
//    public void iSendThePOSTRequestWithValidHeaders() {
//        response = RestAssured.given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when()
//                .body(mandatoryPayload)
//                .when().log().all().when()
//                .post(URL);
//    }
//
//    @Then("I validate the success response for mandatory data")
//    public void iValidateTheSuccessResponseForMandatoryData() {
//        response.then().statusCode(200);
//        response.then().log().all();
//    }
//
//    @Given("I have added Valid URL and wrong format data")
//    public void iHaveAddedValidURLAndWrongFormatData() {
//        URL = "https://petstore.swagger.io/v2/pet";
//        mandatoryPayload="\n" +
//                "  \n" +
//                "  \"name\": \"dogy\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"https://imgur.com/a/uvVbEf1\"]\n" +
//                "\n";
//
//
//    }
//
//    @Then("I validate the success response for wrong format data")
//    public void iValidateTheSuccessResponseForWrongFormatData() {
//        response.then().statusCode(500);
//        response.then().log().all();
//    }
//
//    @When("I send the POST request with wrong headers")
//    public void iSendThePOSTRequestWithWrongHeaders() {
//        response = RestAssured.given()
//                .accept(ContentType.ANY)
//                .contentType(ContentType.XML)
//                .when()
//                .body(mandatoryPayload)
//                .when().log().all().when()
//                .post(URL);
//    }
//
//    @Then("I validate the success response for mandatory data with wrong header")
//    public void iValidateTheSuccessResponseForMandatoryDataWithWrongHeader() {
//        response.then().statusCode(400);
//        response.then().log().all();
//
//    }
//}
