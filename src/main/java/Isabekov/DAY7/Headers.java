package Isabekov.DAY7;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Headers {

    public class SimpleRequest {

        private void request_headers() {
            String resp = given()
                    .queryParam("status", "available")
                    .contentType(ContentType.JSON)
                    .header("accept", "application/json")
                    .when()
                    .body("{ \"id\": 7, \"category\": { \"id\": 7, \"name\": \"string\" }, \"name\": \"humster\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}")
                    .post("https://petstore.swagger.io/v2/pet/")
                    .then()
                    .statusCode(200)
                    .extract()
                    .asString();
            log.info("Response from https://petstore.swagger.io/v2/pet/144: " + resp);
        }
        private void request_petId() {
            String resp = given()
                    .queryParam("status", "available")
                    .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                    .when()
                    .get("https://petstore.swagger.io/v2/pet/7")
                    .then()
                    .statusCode(200)
                    .extract()
                    .asString();
            log.info("Here is your pet https://petstore.swagger.io/v2/pet/144: " + resp);
        }
        @Test
        public void requestTest() {
            request_headers();
            request_petId();
//        request_delete();
//        request_id2();
        }
    }
}
// мне надо вытащить хэдеры и вернуть в виде List of headers явно. Распарсить headers в List хэдеров.  Нам надо явно задать List для выделения памяти