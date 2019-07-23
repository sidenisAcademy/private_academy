/*
package Isabekov.Day6;
 */

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

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
//        log.info("Response from https://petstore.swagger.io/v2/pet/144: " + resp);
    }
    private void request_id() {
        List<Header> resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/7")
                .then()
                .statusCode(200)
                .extract().headers()
                .asList();

        for(int i = 0; i<resp.size(); i++){
            log.info("Here are your headers " + resp.get(i));
        }



//        log.info("Here is your pet https://petstore.swagger.io/v2/pet/144: " + resp);
    }
// stream имеет разные функции, он может фильтровать.
/*
    private void request_id() {
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


    @Test
    public void requestTest() {
        request();
        request_id();
//        request_delete();
//        request_id2();
    }

 */
}
