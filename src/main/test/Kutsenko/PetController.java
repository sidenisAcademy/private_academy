package Kutsenko;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {

    static void findeByStatus() {
        Pet resp = given()
                .queryParam("status","available")
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
        String bodyJson = "{ \"id\": " + id + ", \"category\": { \"id\": 0, \"name\": \"string\" }, \"name\": \"doggie\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}";

        Pet resp = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(bodyJson)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from post https://petstore.swagger.io/v2/pet: " + resp);
        return resp.id;
    }

    static Integer addPetWithPet(Pet newPet) {
        Pet resp = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(newPet)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        log.info("Response from post https://petstore.swagger.io/v2/pet: " + resp);
        return resp.id;
    }

    static List<Header> getPetById(Integer id) {
        List<Header> resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .headers()
                .asList();
        log.info("Response from https://petstore.swagger.io/v2/pet/" + id + ": " + resp);
        return resp;
    }

    static void deletePet(Integer id) {
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

    static String userLogin(String login, String password) {
        String resp = given()
                .queryParams("username",login, "password", password)
                .header("accept", "application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/user/login: " + resp);
        return resp;
    }

    static String userAuth(String login, String password) {
        String resp = given()
                .auth()
                .basic(login, password)
                .header("accept", "application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/user/login: " + resp);
        return resp;
    }

    static String registerSimpleServer(String email, String password) {
        String bodyJson = "{\"email\":\"" + email + "\",\"password\":\"\" + password + \"\"}";

        String resp = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(bodyJson)
                .post("http://172.16.12.25:5555/register")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from post http://172.16.12.25:5555/register: " + resp);
        return resp;
    }

    static String authSimpleServer(String email, String password) {
        String bodyJson = "{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}";

        String resp = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(bodyJson)
                .post("http://172.16.12.25:5555/login")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from post http://172.16.12.25:5555/login: " + resp);
        return resp.split("\"")[3];
    }

    static String getProtected(String token) {
        String resp = given()
                .header("accept", "application/json")
                .header("token", token)
                .when()
                .get("http://172.16.12.25:5555/protected")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from post http://172.16.12.25:5555/protected: " + resp);
        return resp.split("\"")[3];
    }
}
