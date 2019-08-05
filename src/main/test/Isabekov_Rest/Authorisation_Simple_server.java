package Isabekov_Rest;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Authorisation_Simple_server {
    public void register() {
        String resp = given()               //Этап формирования запроса
//                .queryParam("username", "password")
                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .header("accept", "application/JSON")
                .when()
                .body("{\"email\":\"emil_2005@bk.ru\",\"password\":\"1234567\"}")
                .post("http://172.16.12.25:5555/register")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("You have been registered in: " + resp);
    }
    public void Login() {
        String resp = given()               //Этап формирования запроса
//                .queryParam("username", "password")
                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .header("accept", "application/JSON")
                .when()
                .body("{\"email\":\"emil_2005@bk.ru\",\"password\":\"1234567\"}")
                .post("http://172.16.12.25:5555/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Here is your token: " + resp);
    }
// написать код. который будет вытаскивать токен и вставлять его в хидера
    public void Protected() {
        String resp = given()               //Этап формирования запроса
//                .queryParam("username", "password")
                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
                .header("token", "ZW1pbF8yMDA1QGJrLnJ1OjEyMzQ1Njc=")
                .when()
//                .body("{\"email\":\"emil_2005@bk.ru\",\"password\":\"1234567\"}")
                .get("http://172.16.12.25:5555/protected")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("system message: " + resp);
    }

    @Test
    public void requestTest() {
//        method();
//        register();
//        Login();
        Protected();

//        request_petId();
//        request_delete();
//        request_id2();
    }
}