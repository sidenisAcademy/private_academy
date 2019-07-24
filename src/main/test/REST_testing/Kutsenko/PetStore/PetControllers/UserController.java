package REST_testing.Kutsenko.PetStore.PetControllers;

import lombok.extern.slf4j.Slf4j;
import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class UserController {


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

}
