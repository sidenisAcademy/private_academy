package Isabekov_Rest;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Authorisation {

    public void method(){
        String resp = given()
                .queryParam("username", "password")
                .contentType(ContentType.JSON)
                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("You have logged in: " + resp);
}

    public void method2() {
        String resp = given()               //Этап формирования запроса
//                .queryParam("username", "password")
                .auth().basic( "Emil", "12345")
                .contentType(ContentType.JSON)
                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("You have logged in: " + resp);
    }
    @Test
    public void requestTest() {
//        method();
        method2();
//        request_petId();
//        request_delete();
//        request_id2();
    }
}
