package CherkashinTests.RestAssured;


import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetstoreFindByStatus {
    private void findbystatus() {
        String findbystatus = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/pet/findByStatus?status=available" + findbystatus);

    }
    @Test
    public void requestTest() { findbystatus();}

}
