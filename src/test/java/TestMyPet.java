//Содать нового пета 3 разными способами и отправить
//на сервер, проверить что пет сохранился
//
//для каждого способа создать свой степ, способы:
//Создать экземпляр класса PetDto и заполнить его руками через геттеры
//Создать через @AllArgsConstructor
//3)  Сгенерировать PetDto через билдер ( PetDto.builder(). [поля] .build(); )

import Isabekov.All;
import Isabekov.SmokeTests;
import Isabekov.Day6.Categories;
import Isabekov.Day6.PetDto;
import com.jayway.restassured.http.ContentType;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import static com.jayway.restassured.RestAssured.given;



public class TestMyPet {

    public void addPetStep() {

        Categories cat = new Categories();
        cat.id = 7;
        cat.name = "Pushok";

// заполнить dto, отправить, проверить.

        String[] str = new String[1];
        str[0] = "123";

        Categories[] tags = new Categories[2];
        tags[0] = cat;

        PetDto petDto = new PetDto();
        petDto.setId(7);                //здесь задается метод
        petDto.setCategory(cat);        // это относится именно к setter
        petDto.setPhotoUrls(str);
        petDto.setStatus("available");
        petDto.setTags(tags);

        request_headers(petDto);
    }

    private void request_headers(PetDto dto) {
        String resp = given()
                .queryParam("status", "available")
                .contentType(ContentType.JSON)
                .header("accept", "application/json")
                .when()
                .body(dto)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .asString();
       // log.info("Response from https://petstore.swagger.io/v2/pet/144: " + resp);
    }


    @Test //аннотация
    @Category(All.class)
    public void requestTest() {
//        method();
//        register();
//        Login();
        addPetStep();
    }

    @Test //аннотация
    @Category(SmokeTests.class)
    public void requestTest2() {
//        method();
       // register();
//        Login();
        addPetStep();
    }
}