package Trefilova;

import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class Controller {

        public static void requestById(Integer id) {
            Pet response = given()
                    .contentType(ContentType.JSON).
                    when().
                    get("https://petstore.swagger.io/v2/pet/" + id.toString()).
                    then().
                    statusCode(200).
                    extract().
                    as(Pet.class);
            //log.info(response.toString());
            System.out.println("Pet ID is " + id);
        }

        public static void requestById(Integer id, Integer statusCode) {
            given()
                    .contentType(ContentType.JSON).
                            when().
                            get("https://petstore.swagger.io/v2/pet/" + id.toString()).
                            then().
                            statusCode(statusCode);
            //log.info(response.toString());
            System.out.println("Pet is not found");
        }

    public static void deletePet(Integer id) {
            given()
                        .contentType(ContentType.JSON)
                        .when()
                        .delete("https://petstore.swagger.io/v2/pet/" + id)
                        .then()
                        .statusCode(200);
        //log.info(response.toString());
        System.out.println("Pet is deleted");
    }

        public static void requestByStatus() {
            Pet response = given().
                    queryParam("status", "sold").
                    contentType(ContentType.JSON).
                    when().
                    get("https://petstore.swagger.io/v2/pet/findByStatus").
                    then().
                    statusCode(200).
                    extract().
                    as(Pet.class);
            log.info(response.toString());
        }

        public static int createPet() {
            Pet response =
                    given()
                            .header("accept", "application/json")
                            .contentType(ContentType.JSON)
                            .body("{ \"id\": 2210, \"category\": { \"id\": 2210, \"name\": \"Muhtar\" }, \"name\": \"doggie\", \"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], \"status\": \"sold\"}")
                            .post("https://petstore.swagger.io/v2/pet")
                            .then()
                            .statusCode(200)
                            .extract()
                            .as(Pet.class);
            //log.info(response.toString());
            return response.id;
        }
    }
