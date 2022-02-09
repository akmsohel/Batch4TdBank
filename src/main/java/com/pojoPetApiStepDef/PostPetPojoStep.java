//package com.pojoPetApiStepDef;
//
//import com.pojo.Pet.AddPet;
//import com.pojo.Pet.Category;
//import com.pojo.Pet.Tag;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import org.junit.Assert;
//import java.util.Arrays;
//
//
//public class PostPetPojoStep {
//    String payloadForAddPet;
//    String URL;
//
//    public static AddPet addPet;
//    public static Response response;
//
//    @Given("I have added Valid URL and valid payload")
//    public void i_have_added_Valid_URL_and_valid_payload() {
//        URL="https://petstore.swagger.io/v2/pet";
//
//        addPet = new AddPet();
//        addPet.setId(90);
//
//        Category category = new Category();
//        addPet.setCategory(category);
//        category.setId(44);
//        category.setName("huskey");
//        addPet.setName("dogy");
//        addPet.setPhotoUrls(Arrays.asList("www.google.com/image2.png"));
//        Tag tag = new Tag();
//
//        tag.setId(30);
//        tag.setName("browny");
//        addPet.setTags(Arrays.asList(tag));
//        addPet.setStatus("available");
//
//    }
//
//    @When("I send the POST request with valid header")
//    public void iSendThePOSTRequestWithValidHeader() {
//        URL="https://petstore.swagger.io/v2/pet";
//        response = RestAssured.given().accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when()
//                .body(addPet).when().log().all()
//                .post(URL);
//    }
//
//    @Then("I validate the success response")
//    public void iValidateTheSuccessResponse() {
//        response.then().statusCode(200);
//        response.then().log().all();
//        Assert.assertEquals((Integer) response.body().path("id"), addPet.getId());
//        Assert.assertEquals((Integer) response.body().path("category.id"), addPet.getCategory().getId());
//        Assert.assertEquals(response.body().path("category.name"), addPet.getCategory().getName());
//        Assert.assertEquals(response.body().path("name"), addPet.getName());
//        Assert.assertEquals(response.body().path("photoUrls[0]"), addPet.getPhotoUrls().get(0));
//        Assert.assertEquals((Integer) response.body().path("tags[0].id"), addPet.getTags().get(0).getId());
//        Assert.assertEquals(response.body().path("tags[0].name"), addPet.getTags().get(0).getName());
//        Assert.assertEquals(response.body().path("status"), addPet.getStatus());
//
//    }
//
//    @Given("I have added Valid URL and mandatory valid data")
//    public void iHaveAddedValidURLAndMandatoryValidData() {
//        URL="https://petstore.swagger.io/v2/pet";
//
//        addPet = new AddPet();
//        addPet.setId(91);
//
//        Category category = new Category();
//        addPet.setCategory(category);
//        category.setId(41);
//
//        addPet.setName("dogy");
//
//        Tag tag = new Tag();
//
//        tag.setId(30);
//        tag.setName("browny");
//        addPet.setTags(Arrays.asList(tag));
//        addPet.setStatus("sold");
//
//
//
//    }
//
//    @When("I send the POST request with valid header for mandatory data")
//    public void iSendThePOSTRequestWithValidHeaderForMandatoryData() {
//        response = RestAssured.given().accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .when()
//                .body(addPet).when().log().all()
//                .post(URL);
//    }
//
//    @Then("I validate the success response for mandatory data")
//    public void iValidateTheSuccessResponseForMandatoryData() {
//        response.then().statusCode(200);
//        response.then().log().all();
//        Assert.assertEquals((Integer) response.body().path("id"), addPet.getId());
//        Assert.assertEquals((Integer) response.body().path("category.id"), addPet.getCategory().getId());
//        Assert.assertEquals(response.body().path("category.name"), addPet.getCategory().getName());
//        Assert.assertEquals(response.body().path("name"), addPet.getName());
//       // Assert.assertEquals(response.body().path("photoUrls[0]"), addPet.getPhotoUrls().get(0));
//        Assert.assertEquals((Integer) response.body().path("tags[0].id"), addPet.getTags().get(0).getId());
//        Assert.assertEquals(response.body().path("tags[0].name"), addPet.getTags().get(0).getName());
//        Assert.assertEquals(response.body().path("status"), addPet.getStatus());
//
//    }
//}