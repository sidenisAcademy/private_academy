package Kutsenko.PetStore.PetControllers;

import Kutsenko.PetStore.PetSteps.PetModels.PetDto;
import Kutsenko.PetStore.Utils.Spec;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {

    private static final String pet = "/pet";
    private static final String petWithId = "/pet/{id}";
    private static final String findByStatus = "/pet/findByStatus";

    public static void addPet(String bodyJson) {
        PetDto resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .body(bodyJson)
                .post(pet)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .as(PetDto.class);
        log.info("POST response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static void addPetWithPetInstance(PetDto newPet) {
        PetDto resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .body(newPet)
                .post(pet)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .as(PetDto.class);
        log.info("POST response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static void editPet(PetDto modifiedPet) {
        PetDto resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .body(modifiedPet)
                .put(pet)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .as(PetDto.class);
        log.info("PUT response from https://petstore.swagger.io/v2/pet: " + resp);
    }

    public static PetDto getPetById(Long id) {
        PetDto resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .get(petWithId, id)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .as(PetDto.class);
        log.info("GET response from https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
        return resp;
    }

    public static List<PetDto> getPetsByStatus(String status) {
        PetDto[] resp = given()
                .spec(Spec.initRequestSpec())
                .queryParam("status", status)
                .when()
                .get(findByStatus)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .as(PetDto[].class);
        log.info("GET response from https://petstore.swagger.io/v2/pet/findByStatus?status=" + status + ":");
        List<PetDto> arPets = Arrays.asList(resp);
        arPets.forEach(pet -> log.info(pet.toString()));
        return arPets;
    }

    public static void deletePet(Long id) {
        String resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .delete(petWithId, id)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .asString();
        log.info("DELETE from https://petstore.swagger.io/v2/pet/" + id + " successfully");
    }

    public static void checkPetNotFound(Long id) {
        String resp = given()
                .spec(Spec.initRequestSpec())
                .when()
                .get(petWithId, id)
                .then()
                .statusCode(404)
                .extract()
                .asString();
        log.info("GET response from https://petstore.swagger.io/v2/pet/" + id + " (expected status code - 404): " + resp);
    }

}
