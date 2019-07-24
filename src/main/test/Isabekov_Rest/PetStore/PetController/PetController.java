package Isabekov_Rest.PetStore.PetController;
//создаем класс в котором у нас будет содержаться логика реализованная в Swagger.
// в моем случа Pet https://petstore.swagger.io/#/

import Isabekov_Rest.PetStore.PetSteps.PetModels.PetDto;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import java.util.List;
import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {


    public void pushPet(PetDto pet) {
        given()
                .contentType(ContentType.JSON)
                .when()
                .body(pet)
                .get("https://petstore.swagger.io/v2/pe")
                .then()
                .statusCode(200);
    }
}
//    public String request_id() {
//        String resp = given()
//                .queryParam("status", "available")
//                .contentType(ContentType.JSON)
////                .header("accept", "application/xml")
//                .when()
//                .get("https://petstore.swagger.io/v2/pet/8")
//                .then()
//                .statusCode(200)
//                .extract()
//                .asString();
//        log.info("Here is your pet: " + resp);
//        return resp;
//    }
//
//    private void request_id2() {
//        String resp = given()
//                .queryParam("status", "available")
//                .contentType(ContentType.JSON)
////                .header("accept", "application/xml")
//                .when()
//                .post("https://petstore.swagger.io/v2/pet/8")
//                .then()
//                .statusCode(200)
//                .extract()
//                .asString();
//        log.info("Here is your pet: " + resp);
//    }
//
//    @Test
//    public void requestTest() {
//        request_id();
//    }
//}

//получил Pet
//6198 [main] INFO Isabekov_Rest.PetStore.PetController.PetController - Here is your pet:
// {"id":8,"category":{"id":8,"name":"Snejok"},"photoUrls":["123"],"tags":[{"id":8,"name":"Snejok"},null],"status":"available"}