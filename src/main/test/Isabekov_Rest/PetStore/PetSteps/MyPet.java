package Isabekov_Rest.PetStore.PetSteps;

//Содать нового пета 3 разными способами и отправить
//на сервер, проверить что пет сохранился
//
//для каждого способа создать свой степ, способы:
//Создать экземпляр класса PetDto и заполнить его руками через геттеры
//Создать через @AllArgsConstructor
//3)  Сгенерировать PetDto через билдер ( PetDto.builder(). [поля] .build(); )

import Isabekov.Day6.Category;
import Isabekov.Day6.PetDto;
import com.jayway.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j   //Нотация для логгирования
// первый вариант


public class MyPet {

    public void addPetStep() {

        Category cat = new Category();
        cat.id = 8;
        cat.name = "Snejok";

// заполнить dto, отправить, проверить.

        String[] str = new String[1];
        str[0] = "123";

        Category[] tags = new Category[2];
        tags[0] = cat;

        PetDto petDto = new PetDto();
        petDto.setId(8);                //здесь задается метод
        petDto.setCategory(cat);        // это относится именно к setter
        petDto.setPhotoUrls(str);
        petDto.setStatus("Sold");
        petDto.setTags(tags);

        request_headers(petDto);
    }

    private void request_headers(PetDto dto) {
        String resp = given()
                .queryParam("status", "Sold")
                .contentType(ContentType.JSON)
                .header("accept", "application/json")
                .when()
                .body(dto)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        log.info("Response from https://petstore.swagger.io/v2/pet/144: " + resp);
    }

    @Test //аннотация
    public void requestTest() {
//        method();
//        register();
//        Login();
        addPetStep();
    }
}

// 1 созданный pet
//8339 [main] INFO Isabekov_Rest.PetStore.PetSteps.MyPet - Response from https://petstore.swagger.io/v2/pet/144:
// {"id":7,"category":{"id":7,"name":"Pushok"},"photoUrls":["123"],"tags":[{"id":7,"name":"Pushok"},null],"status":"available"}

// смена категории и статуса
//6646 [main] INFO Isabekov_Rest.PetStore.PetSteps.MyPet - Response from https://petstore.swagger.io/v2/pet/144:
// {"id":8,"category":{"id":8,"name":"Snejok"},"photoUrls":["123"],"tags":[{"id":8,"name":"Snejok"},null],"status":"Sold"}
