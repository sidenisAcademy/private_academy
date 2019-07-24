package Trefilova.PetStore.PetController;

import Trefilova.PetStore.PetSteps.PetModels.*;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ArrayUtils.toArray;

@Slf4j
public class PetController {

    public static void addNewPet(Pet pet) {
        Pet response = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .body(pet)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        //log.info(response.toString());
        //return pet.id;
    }

    public static void updatePet(Pet pet){
        given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .body(pet)
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
    }

    public static void deletePet(long id) {
        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200);
        System.out.println("Pet is deleted");
    }

    public static void findPetById(long id) {
            Pet response = given()
                    .contentType(ContentType.JSON).
                    when().
                    get("https://petstore.swagger.io/v2/pet/" + id).
                    then().
                    statusCode(200).
                    extract().
                    as(Pet.class);
    }

    public static void findPetById(long id, Integer statusCode) {
        given()
                .contentType(ContentType.JSON).
                        when().
                        get("https://petstore.swagger.io/v2/pet/" + id).
                        then().
                        statusCode(statusCode);
        //log.info(response.toString());
        System.out.println("Pet is not found");
    }

    public static List<Pet> findPetByStatus(String status) {
        List<Pet> pets =
                Arrays.stream(given().
                        queryParam("status", status)
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .when()
                        .get("https://petstore.swagger.io/v2/pet/findByStatus")
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        //                asString();
                        //        log.info(response);
                        .as(Pet[].class)).collect(toList());
        return pets;
//        List<Pet> petss = Arrays.stream(pets)
        //log.info(response.toString());
    }
}
