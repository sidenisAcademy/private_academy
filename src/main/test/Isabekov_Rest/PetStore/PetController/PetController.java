package Isabekov_Rest.PetStore.PetController;
//создаем класс в котором у нас будет содержаться логика реализованная в Swagger.
// в моем случа Pet https://petstore.swagger.io/#/

import Isabekov_Rest.PetStore.PetSteps.PetModels.PetDto;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetController {


    public void pushPet(PetDto pet) {
        log.info("pet: " + pet.getId());
        PetDto pet1 = given()
                .contentType(ContentType.JSON)
                .when()
                .body(pet)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract().as(PetDto.class);
        log.info("your pet has been posted: " + pet1.getId());
    }

    public void changePet(PetDto pet){
        PetDto pet1 = given()
                .contentType(ContentType.JSON)
                .when()
                .body(pet)
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract().as(PetDto.class);
    }

    public PetDto request_pet() {
        PetDto resp = given()
                .queryParam("status", "Sold")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/8")
                .then()
                .statusCode(200)
                .extract().as(PetDto.class);
        log.info("Here is your pet: " + resp); // контроллер создаст сам dto и засунет туда все возвращенные данные
        return resp;

    }

    public PetDto request_pet(long id) {
        PetDto resp = given()
                .queryParam("status", "Sold")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id) // дергаем id и предаем Step который нам нужен
                .then()
                .statusCode(200)
                .extract().as(PetDto.class);
        log.info("Here is your pet: " + resp); // контроллер создаст сам dto и засунет туда все возвращенные данные
        return resp;

    }

    public String request_petList() {
        String resp = given()
                .queryParam("status", "Sold")
                .contentType(ContentType.JSON)
//                .header("accept", "application/xml")
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("the list of sold pets: " + resp);
        return resp;
//        System.out.println(Arrays.toString(resp));
    }
}

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
//        pushPet();
//    }
//}


//получил Pet
//6198 [main] INFO Isabekov_Rest.PetStore.PetController.PetController - Here is your pet:
// {"id":8,"category":{"id":8,"name":"Snejok"},"photoUrls":["123"],"tags":[{"id":8,"name":"Snejok"},null],"status":"available"}