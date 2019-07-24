package CherkashinTests.RestAssured.HappyThreePets;

import CherkashinTests.RestAssured.PetDto;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;

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
        log.info("Pet Created");
    }

     public void gettingPet (PetDto petDto) {
         PetDto get = given()
                 .contentType(ContentType.JSON)
                 .when()
                 .get("https://petstore.swagger.io/v2/pet/" + petDto.id)
                 .then()
                 .statusCode(200)
                 .extract()
                 .as(PetDto.class);
         log.info("Pet Getted " + " " + petDto.name + " " + petDto.status);
     }

     public void putChanges (PetDto petDto) {
         PetDto put = given()
                 .contentType(ContentType.JSON)
                 .when()
                 .body(petDto)
                 .put("https://petstore.swagger.io/v2/pet" + petDto.id)
                 .then()
                 .statusCode(200)
                 .extract()
                 .as(PetDto.class);
         log.info("Pet " + petDto.id + " is changed");
     }

     public void delPet (PetDto petDto) {
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

