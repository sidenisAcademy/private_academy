package CherkashinTests.RestAssured.Extract;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class SimpleServer {
    private void Register() {
        String JSON = "{ \"email\":\"ya@sidenis.com\", \"password\":\"ololo\" }";
        String registr = given()
                .contentType(ContentType.JSON)
                .when()
                .body(JSON)
                .post("http://172.16.12.25:5555/register")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Registred: " + registr);
    }

    private void Auth() {
        String JSON = "{ \"email\":\"ya@sidenis.com\", \"password\":\"ololo\" }";
        String token = given()
                .contentType(ContentType.JSON)
                .when()
                .body(JSON)
                .post("http://172.16.12.25:5555/login")
                .then()
                .statusCode(200)
                .extract().jsonPath().get("token");
                log.info("You are authorized: " + token);
    }

    @Test
    public void requesttest() {
        Register();
        Auth();
       }
}
