package CherkashinTests.RestAssured.ControllerStepsTest;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Controller {

    public void PostPet(String JSON) {
        String post = given()
                .contentType(ContentType.JSON)
                .header(new Header("accept", "application/json"))
                .when()
                .body(JSON)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Pet created");
    }

    public void GetPet(Integer id) {
        String getpet = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Pet getted from https://petstore.swagger.io/v2/pet/" + id);
    }

    public void DelPet(Integer id) {
        String delpet = given()
                .contentType(ContentType.JSON)
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Pet deleted on https://petstore.swagger.io/v2/pet/" + id);
    }

    public void GetDeletedPet(Integer id) {
        String getdelpet = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + id)
                .then()
                .statusCode(404)
                .extract()
                .asString();
        log.info("Getting 404 after deleting pet with id " + id);
    }
}
