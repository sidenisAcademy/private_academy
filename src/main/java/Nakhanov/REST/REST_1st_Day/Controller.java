package Nakhanov.REST.REST_1st_Day;

import Nakhanov.REST.PetDTO.Pet;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Controller {

    public static String petRequestById(long id, int code) {
        String resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(code)
                .extract()
                .asString();
        return resp;
    }

    public static Pet createPet() {
        String str = "{ \"id\": 6695, \"category\": { \"id\": 0, \"name\": \"KOT\" }," +
                " \"name\": \"Kitty\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, " +
                "\"name\": \"string\" } ], \"status\": \"sold\"}";

        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        Pet pet = given().urlEncodingEnabled(true)
                .body(str)
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .post(baseURI)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);

        return pet;
    }

    public static void deletePet(int id) {
        given()
                .header("Accept", "application/json")
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200);
    }

    public void petRequestByStatus() {
        String resp = given()
                .queryParam("status", "sold")
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response : " + resp);
    }

    public void petRequestByIdToJson(int code) {
        Pet pet = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/6695")
                .then()
                .statusCode(code)
                .extract()
                .as(Pet.class);

    }

    public static Pet createPetByDiffWays(Pet pet) {
        Pet pet1 = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(pet)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        return pet1;
    }
}
