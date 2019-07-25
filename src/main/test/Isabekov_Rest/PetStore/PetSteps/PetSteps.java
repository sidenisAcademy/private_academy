package Isabekov_Rest.PetStore.PetSteps;

import Isabekov.Day6.Category;
import Isabekov_Rest.PetStore.PetController.PetController;
import com.jayway.restassured.http.ContentType;
import Isabekov_Rest.PetStore.PetSteps.PetModels.PetDto;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

// создаю конерктного питомца на основе существующей DTO - генерим
// описать end-point на который мы отправляем PET
public class PetSteps {

    PetController petController = new PetController();

    public void createPetStep1() {
//        String str = petController.request_id();
        PetDto Sharik = addPetStep(); // проинициализировать все параметры
        petController.pushPet(Sharik); // Отдаем созданного на бэк
//        petController.request_pet();
    }

    public PetDto addPetStep() {

        Category cat = new Category();
        cat.id = 8;
        cat.name = "Snejok";

// заполнить dto, отправить, проверить.

        String[] str = new String[1];
        str[0] = "http://pet8";

        Category[] tags = new Category[2];
        tags[0] = cat;

        PetDto petDto = new PetDto(); //здесь задается метод
        petDto.setId(8);
        petDto.setCategory(cat);        // это относится именно к setter
        petDto.setPhotoUrls(str);
        petDto.setStatus("Sold");
        petDto.setTags(tags);

        return petDto;
    }

    public void getPetStep2() {     // весь новый код лучше выносить в новый метод
    PetDto info = petController.request_pet();
    assertTrue(info.id == 8);   // проверка что в поле id стоит значние 8, бывают разные типы asserts
    assertEquals(info.status , "Sold");
//    assertTrue; //для category можно вытащить отдельно
//    assertTrue(info.category == category);
    }

}