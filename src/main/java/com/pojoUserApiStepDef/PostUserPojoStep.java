package com.pojoUserApiStepDef;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojoUser.UserPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostUserPojoStep {
    String payloadForAddUser;
    String URL;
    public  UserPojo userPojo;
    public static Response response;
    public static String userJson;
    @Given("I have added Valid URL and valid UserPayload")
    public void iHaveAddedValidURLAndValidUserPayload() throws JsonProcessingException {

        URL = "https://petstore.swagger.io/v2/user/createWithList";

        userPojo = new UserPojo();



        userPojo.setId(567);
        userPojo.setUsername("JohnDore");
        userPojo.setFirstName("John");
        userPojo.setLastName("Dore");
        userPojo.setEmail("johndore@gmail.com");
        userPojo.setPassword("John12345");
        userPojo.setPhone("347897530");
        userPojo.setUserStatus(6);



        List<UserPojo> userPojoList=new ArrayList<UserPojo>();
        userPojoList.add(userPojo);

        ObjectMapper objectMapper = new ObjectMapper();
        userJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userPojoList);
        System.out.println(userJson);




    }


    @When("^I send the POST request with valid header for user$")
    public void iSendThePOSTRequestWithValidHeaderForUser() throws JsonProcessingException {

        URL = "https://petstore.swagger.io/v2/user/createWithList";
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<UserPojo> allEmploeesDetails = objectMapper.readValue(allEmployeeJson,
//                new TypeReference<List<UserPojo>>() {
//                });

        response = RestAssured.given().
                accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(userPojo).when().log().all()
                .post(URL);
    }


    @Then("I validate the success response for user")
    public void iValidateTheSuccessResponseForUser() {
      //  response.then().statusCode(200);
        response.then().log().all();
//        Assert.assertEquals((Integer) response.body().path("firstName"), userPojo.getId());
//        Assert.assertEquals( response.body().path("userName"), userPojo.getUsername());
//        Assert.assertEquals( response.body().path("firstName"), userPojo.getFirstName());
//        Assert.assertEquals( response.body().path("lastName"), userPojo.getLastName());
//        Assert.assertEquals( response.body().path("email"),userPojo.getEmail());
//        Assert.assertEquals( response.body().path("password"), userPojo.getPassword());
//
//        Assert.assertEquals(response.body().path("phone"), userPojo.getEmail());
//        Assert.assertEquals((Integer) response.body().path("userStatus"), userPojo.getUserStatus());


    }


}

