package REST_testing;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

//@Slf4j
//
//public class GetHeader {
//
//    private void request() {
//        Header header = new Header();
//        List<Header> resp = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("https://petstore.swagger.io/v2/pet/9199424981609352476")
//                .then()
//                .statusCode(200)
//                .extract()
//                .headers()
//                .asList();
//       // log.info("Response from https://petstore.swagger.io/v2/pet/9199424981609352476: " + resp);
//
//        for (List<Header> int i){
//
//        }
//
//
//    }
//
//    @Test
//    public void requestTest() {
//        request();
//    }
//}
