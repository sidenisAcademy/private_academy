package REST_testing.Isabekov_Headers_Day7;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.specification.ProxySpecification.auth;

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
