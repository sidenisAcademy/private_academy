package REST_testing;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class SimpleRequest {

    private void request() {
        String resp = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/144")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/pet/208: " + resp);
    }

    @Test
    public void requestTest() {
        request();
    }
}
