package REST_testing;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j

public class Auth {
    private void request() {
        ValidatableResponse resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/user/login?username=user&password=password")
                .then()
                .statusCode(200);

        log.info("\"https://petstore.swagger.io/v2/user/login?username=user&password=password" + resp);
    }

    private void auth1(){ String resp = given()
            .auth()
                .basic("username", "password")
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                .then()
                .extract()
                .asString();

        log.info("\"https://petstore.swagger.io/v2/user/login" + resp);
    }

    @Test
    public void auth1Test() {
        auth1();
    }
}


