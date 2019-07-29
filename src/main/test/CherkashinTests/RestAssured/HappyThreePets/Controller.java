package CherkashinTests.RestAssured.HappyThreePets;

import CherkashinTests.RestAssured.PetDto;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;

@Slf4j

public class Controller {

    public void creatingPet(PetDto petDto) {

        PetDto post = given()
                .contentType(ContentType.JSON)
                .header(new Header("accept", "application/json"))
                .when()
                .body(petDto)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Pet Created with Id " + post.id);
    }

    public PetDto gettingPetById(long id) {
        PetDto get = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Pet Getted by Id " + get.id);
        return get;
    }

    public List<PetDto> gettingPetsByStatus(String status) {
        PetDto[] get = given()
                .queryParam("status", status)
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto[].class);
        log.info("Pet Getted by Status");
        return Arrays.asList(get);
    }

    public void putChanges(PetDto petDto) {
        PetDto put = given()
                .contentType(ContentType.JSON)
                .when()
                .body(petDto)
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Pet " + petDto.id + " is changed");
    }

    public void delPet(PetDto petDto) {
        PetDto del = given()
                .contentType(ContentType.JSON)
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + petDto.id)
                .then()
                .statusCode(200)
                .extract()
                .as(PetDto.class);
        log.info("Pet deleted from https://petstore.swagger.io/v2/pet/");
    }
}

