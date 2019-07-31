package Trefilova.Pets.PetController;

import Trefilova.Pets.PetModels.Pet;

import Trefilova.Pets.Utils.PetBaseURI;
import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static java.util.stream.Collectors.toList;

@Slf4j
public class PetController {

    public static void addNewPet(Pet pet) {
        Pet response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(pet)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
    }

    public static void updatePet(Pet pet){
        given()
                .accept(ContentType.JSON)
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
                .delete(PetBaseURI.setBaseURI() + id)
                .then()
                .statusCode(200);
        System.out.println("Pet is deleted");
    }

    public static void findPetById(long id) {
        Pet response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(PetBaseURI.setBaseURI() + id)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
    }

    public static void findPetById(long id, Integer statusCode) {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(PetBaseURI.setBaseURI() + id)
                .then()
                .statusCode(statusCode);
        System.out.println("Pet is not found");
    }

    public static boolean isPetExists(long id) {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200);
        //System.out.println("Pet with ID" + id + " exists.");
        return true;
    }

    public static List<Pet> findPetByStatus(String status) {
        List<Pet> pets =
                Arrays.stream(given()
                        .queryParam("status", status)
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .when()
                        .get(PetBaseURI.setBaseURI() + "findByStatus")
                        .then()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as(Pet[].class)).collect(toList());

        //pets.forEach(pet -> log.info("pet: " + pet.status));
        return pets;
    }
}
