package Trefilova;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

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
        Pet pet1 = new Pet();

        Category category = new Category();
        category.id = 1;
        category.name = "Cat";

        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("url1");
        photoUrls.add("url2");

        Tags tag = new Tags();
        tag.id = 0;
        tag.name = "tag";

        List<Tags> tagsList = new ArrayList<>();


        pet1.setId(15);
        pet1.setCategory(category);
        pet1.setName("Vasiliy");
        pet1.setPhotoUrls(photoUrls);
        pet1.setTags(tagsList);
        pet1.setStatus("available");

        Pet response = given()
                .header("accept", "application/json")
                .contentType(ContentType.JSON)
                .body(pet1)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .as(Pet.class);
        //log.info(response.toString());
        return pet1.id;
    }
}
