package REST_testing.Kutsenko.PetStore.PetControllers;

import REST_testing.Kutsenko.PetStore.PetSteps.PetModels.Pet;
import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {

    private static final String basePath = "https://petstore.swagger.io/v2/pet";
    private static final String pets = "/pet";
    private static final String petWithId = "/pet/{petId}";
    private  static final String findByStatus = "/pet/findByStatus";

    public static void addPet(String bodyJson) {
        Pet resp = given()
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .body(bodyJson)
                .post(pets)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static void addPetWithPetInstance(Pet newPet) {
        Pet resp = given()
                .basePath(basePath)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .body(newPet)
                .post(pets)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static void editPet(Pet modifiedPet) {
        Pet resp = given()
                .basePath(basePath)
                .pathParam("petId", modifiedPet.id)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .body(modifiedPet)
                .put(petWithId)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static Pet getPetById(Integer id) {
        Pet resp = given()
                .basePath(basePath)
                .pathParam("petId", id)
                .accept(ContentType.JSON)
                .when()
                .get(petWithId)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
        return resp;
    }

    public static Pet[] getPetsByStatus(String status) {
        Pet[] resp = given()
                .basePath(basePath)
                .queryParam("status", status)
                .accept(ContentType.JSON)
                .when()
                .get(findByStatus)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet[].class);
        log.info("Response from https://petstore.swagger.io/v2/pet/findByStatus: " + resp);
        return resp;
    }

    public static void deletePet(Integer id) {
        String resp = given()
                .header("accept", "application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from delete https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
    }

    public static void checkPetNotFound(Integer id) {
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
