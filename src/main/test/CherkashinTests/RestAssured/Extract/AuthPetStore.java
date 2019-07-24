package CherkashinTests.RestAssured.Extract;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class AuthPetStore {
    private void Auth() {
        String username = "user";
        String pass = "password";
        String auth = given()
                .auth()
                .basic(username, pass)
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("loginnded?: " + auth);
    }
    @Test
    public void requesttest() {
        Auth();
    }
}