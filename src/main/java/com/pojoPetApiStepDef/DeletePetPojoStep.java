//package com.pojoPetApiStepDef;
//
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//public class DeletePetPojoStep {
//
//    public Response response;
//    PostPetPojoStep addPetStep = new PostPetPojoStep();
//
//    @When("I send the Delete request with valid headers")
//    public void iSendTheDeleteRequestWithValidHeaders() {
//
//            int id = addPetStep.addPet.getId();
//            String url = "https://petstore.swagger.io/v2/pet/";
//            url = url.concat(String.valueOf(id));
//           // response = addPetStep.response;
//            response = RestAssured.given().
//                    accept(ContentType.JSON).when().
//                    log().all().
//                    delete(url);
//            response.then().log().all();
//
//
//    }
//
//    }
//
//
