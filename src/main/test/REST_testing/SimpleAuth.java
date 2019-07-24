package REST_testing;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;


@Slf4j
public class SimpleAuth {
    private void auth2(){
        String resp = given()
            .contentType(ContentType.JSON)
            .when()
            .body("{  \"email\": \"string22\", \"password\": \"string22\"}")
            .post("http://172.16.12.25:5555/register")
            .then()
            .extract()
            .asString();

        log.info("http://172.16.12.25:5555/register" + resp);
    }

    @Test
    public void auth2Test() {
        auth2();
    }

    private void login(){ String resp = given()
            .contentType(ContentType.JSON)
            .when()
            .body("{  \"email\": \"string22\", \"password\": \"string22\"}")
            .post("http://172.16.12.25:5555/login")
            .then()
            .extract()
            .asString();

        log.info("http://172.16.12.25:5555/register" + resp);
    }

    @Test
    public void loginTest() {
        login();
    }
}

