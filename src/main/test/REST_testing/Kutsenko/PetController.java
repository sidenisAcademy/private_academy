package REST_testing.Kutsenko;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {

    static void findeByStatus() {
        Pet resp = given().queryParam("status","available")
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet/findByStatus: " + resp);
    }

    static Integer addPet(Integer id) {
        String bodeJson = "{ \"id\": " + id + ", \"category\": { \"id\": 0, \"name\": \"string\" }, \"name\": \"doggie\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}";

        Pet resp = given().header("accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(bodeJson)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from post https://petstore.swagger.io/v2/pet: " + resp);
        return resp.id;
    }

    static void getPetById(Integer id) {
        Pet resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
    }

    static void deletePet(Integer id) {
        String resp = given().header("accept", "application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from delete https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
    }

    static void checkPetNotFound(Integer id) {
        String resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(404)
                .extract()
                .asString();
        log.info("Response from PetSteps https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
    }

}
