package REST_testing;

import Isabekov.DTO.DTO1;
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
                .body("{\"email\":\"string\",\"password\":\"string\"}")
                .post("http://172.16.12.25:5555/login")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().get("token");
        log.info("token " + resp);

        DTO1 dto = new DTO1();
        dto.setEtag("123");
    }

    @Test
    public void requestTest() {
        request();
    }
}
