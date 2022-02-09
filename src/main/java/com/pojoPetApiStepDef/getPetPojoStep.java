//package com.pojoPetApiStepDef;
//
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//
//public class getPetPojoStep {
//    PostPetPojoStep addPetStep = new PostPetPojoStep();
//    public Response response;
//
//    @When("I send the Get request with valid headers")
//    public void iSendTheGetRequestWithValidHeaders() {
//
//        int id = addPetStep.addPet.getId();
//        String url = "https://petstore.swagger.io/v2/pet/";
//        url = url.concat(String.valueOf(id));
//
//        response = addPetStep.response;
//        response = RestAssured.given().
//                accept(ContentType.JSON).
//                contentType(ContentType.JSON).when().
//                log().all().
//                get(url);
//        response.then().log().all();
//
//
//    }
//}
