package Nakhanov.REST.REST_3rd_Day.PetController;


import Nakhanov.REST.PetDTO.Pet;
import com.jayway.restassured.response.ValidatableResponse;

import java.util.Map;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

public class PetController {


    public static void addNewPetEndpoint(Pet pet){
        given().spec(Utils.setSpec())
                .body(pet)
                .when()
                .post(baseURI)
                .then()
                .statusCode(200);
    }

    public static Pet getPetByIdEndpoint(long id){
        Pet pet = given().spec(Utils.setSpec())
                .when()
                .get(baseURI + id)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        return pet;
    }

    public static Pet putPetEndpoint(Pet newPet){
        Pet pet = given().spec(Utils.setSpec())
                .body(newPet)
                .when()
                .put(baseURI)
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        return pet;
    }

    public static Pet[] getPetByStatusEndpoint(String status){
        Pet[] pet = given().spec(Utils.setSpec())
                .queryParam("status", status)
                .when()
                .get(baseURI + "findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet[].class);
//        List<Pet> petList = Arrays.stream(pet).collect(Collectors.toList());
//        List<Pet> petList = Arrays.asList(pet);
        return pet;
    }

    public static Pet[] getPetByStatusEndpoint2(Map<String, String> map){
        return temp("pet/findByStatus", map).extract().as(Pet[].class);
    }

    public static Pet[] getPetByStatusEndpoint3(Map<String, String> map){
        return temp("/store/inventory", map).extract().as(Pet[].class);
    }

    public static void updatePetEndpoint (long id, String name, String status){
        given().spec(Utils.setSpec())
                .queryParam("name", name)
                .queryParam("status", status)
                .when()
                .post(baseURI + id)
                .then()
                .statusCode(200);
    }
    public static void updatePetEndpoint (long id, Map<String, String> map) {
        given().spec(Utils.setSpec())
                .queryParams(map)
                .when()
                .post(baseURI + id)
                .then()
                .statusCode(200);
    }

    public static void deletePetEndpoint(long id, String apikey){
        given().spec(Utils.setSpec())
                .header("api-key", apikey)
                .when()
                .delete(baseURI + id)
                .then()
                .statusCode(200);
    }

    private static ValidatableResponse temp(String path, Map<String, String> map) {
       return given().spec(Utils.setSpec())
                .queryParams(map)
                .when()
                .get(path)
                .then()
                .statusCode(200);
    }

}
