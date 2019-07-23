package REST_testing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;


@Slf4j
public class SimpleAuth {
    private void auth2(){ String resp = given()
            .when()
            .body("{  \"email\": \"string\",\n" +
                    "  \"password\": \"string\"}")
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
}

