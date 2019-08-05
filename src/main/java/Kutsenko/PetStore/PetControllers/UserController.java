package Kutsenko.PetStore.PetControllers;

import Kutsenko.PetStore.Utils.Spec;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class UserController {

    private static final String usersLogin = "/user/login";

    public static void userLogin(String login, String password) {
        String resp = given()
                .spec(Spec.initRequestSpec())
                .queryParams("username", login, "password", password)
                .when()
                .get(usersLogin)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .body()
                .asString();
        log.info("GET response from https://petstore.swagger.io/v2/user/login: " + resp);
    }

    public static void userAuth(String login, String password) {
        String resp = given()
                .spec(Spec.initRequestSpec())
                .auth()
                .basic(login, password)
                .when()
                .get(usersLogin)
                .then()
                .spec(Spec.initResponseSpec())
                .extract()
                .body()
                .asString();
        log.info("GET response from https://petstore.swagger.io/v2/user/login: " + resp);
    }

}
