package REST_testing.Kutsenko.PetStore.PetControllers;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class UserController {

    private static final String basePath = "https://petstore.swagger.io/v2";
    private static final String usersLogin = "/user/login";

    public static String userLogin(String login, String password) {
        String resp = given()
                .basePath(basePath)
                .queryParams("username", login, "password", password)
                .accept(ContentType.JSON)
                .when()
                .get(usersLogin)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/user/login: " + resp);
        return resp;
    }

    public static String userAuth(String login, String password) {
        String resp = given()
                .basePath(basePath)
                .auth()
                .basic(login, password)
                .accept(ContentType.JSON)
                .when()
                .get(usersLogin)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/user/login: " + resp);
        return resp;
    }

}