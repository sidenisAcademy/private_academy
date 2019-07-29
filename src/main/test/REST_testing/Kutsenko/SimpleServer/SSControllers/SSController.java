package REST_testing.Kutsenko.SimpleServer.SSControllers;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class SSController {

    public static String registerSimpleServer(String email, String password) {
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

    public static String authSimpleServer(String email, String password) {
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

    public static String getProtected(String token) {
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
