package Isabekov_Rest.PetStore.PetSteps;

import Isabekov.Day6.Category;
import Isabekov_Rest.PetStore.PetController.PetController;
import com.jayway.restassured.http.ContentType;
import Isabekov_Rest.PetStore.PetSteps.PetModels.PetDto;

import static com.jayway.restassured.RestAssured.given;

// создаю конерктного питомца на основе существующей DTO - генерим
public class PetSteps {

    PetController petController = new PetController();

    public void createPet() {
//        String str = petController.request_id();
        PetDto Sharik = addPetStep(); // проинициализировать все параметры
        petController.pushPet(Sharik); // Отдаем созданного
    }
    public PetDto addPetStep() {

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

return petDto;
    }

}