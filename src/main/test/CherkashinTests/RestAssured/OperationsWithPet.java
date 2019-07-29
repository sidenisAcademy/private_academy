package CherkashinTests.RestAssured;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class OperationsWithPet {
    private long PostPet() {

        String body = "{ \"id\": 667, \"category\": { \"id\": 667, \"name\": \"Ivan\" }, \"name\": \"Pes\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"available\"}";
        PetDto postpet = given()
                .contentType(ContentType.JSON)
                .header(new Header("accept", "application/json"))
                .when()
                .body(body)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Post pet in https://petstore.swagger.io/v2/pet" + postpet);
        return(postpet.id);
    }

    private void GetPet(long id) {
        PetDto getpet = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Pet getted from https://petstore.swagger.io/v2/pet/" + id + getpet);
    }



    private void DelPet(long id) {
        String delpet = given()
                .contentType(ContentType.JSON)
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Pet deleted on https://petstore.swagger.io/v2/pet/" + id + delpet);
    }



    private void GetDeletedPet(long id) {
        String getdelpet = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(404)
                .extract()
                .asString();
        log.info("Getting 404 after deleting pet" + getdelpet);
    }

    @Test
    public void requesttest() {
        long id = PostPet();
        GetPet(id);
        DelPet(id);
        GetDeletedPet(id);
    }
}

