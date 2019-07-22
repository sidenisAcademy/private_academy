package REST_testing;

import Isabekov.Day6.PetDto;
import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.sessionId;

@Slf4j
public class SimpleRequest {

    private void request() {
        String resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
                .header("accept", "application/json")
                .when()
                .body("{ \"id\": 7, \"category\": { \"id\": 7, \"name\": \"string\" }, \"name\": \"humster\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}")
                .post("https://petstore.swagger.io/v2/pet/")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/pet/144: " + resp);
    }

    private int request_id() {   // всегда в описании метода надо писать какой тип данныж он будет возвращать


        PetDto resp = given()
//                .queryParam("status", "available")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/7")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        resp.getId();
        log.info("Here is your " + resp.toString());
        return resp.getId();  //конец метода, после него ничего не возвращается.

    }


/*
        private void request_id1() {
        String resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/7")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Here is your pet https://petstore.swagger.io/v2/pet/144: " + resp);
    }

    private void request_delete() {
        String resp = given()
//                .queryParam("status", "available")
                .contentType(ContentType.JSON)
                .header("accept", "application/xml")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/7")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Your pet has been removed https://petstore.swagger.io/v2/pet/144: " + resp);
    }
    private void request_id2() {
        String resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/7")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Here is your pet https://petstore.swagger.io/v2/pet/144: " + resp);
    }

 */
    @Test
    public void requestTest() {
        request();
        request_id();
//        request_delete();
//        request_id2();
    }
}
