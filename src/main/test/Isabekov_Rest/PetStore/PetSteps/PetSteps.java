package Isabekov_Rest.PetStore.PetSteps;

import Isabekov.Day6.Category;
import Isabekov_Rest.PetStore.PetController.PetController;
import com.jayway.restassured.http.ContentType;
import Isabekov_Rest.PetStore.PetSteps.PetModels.PetDto;
import static org.junit.Assert.*;

// создаю конерктного питомца на основе существующей DTO - генерим
// описать end-point на который мы отправляем PET
public class PetSteps {

    PetController petController = new PetController();

    public void createPetStep1() {
//        String str = petController.request_id();
        PetDto Sharik = addPetStep(); // проинициализировать все параметры
        petController.pushPet(Sharik); // Отдаем созданного на бэк
        updatePetStep3();        // изменяем имя категории и статус
//        petController.request_pet();
    }

    public void updatePetStep3(){
       PetDto pet =  petController.request_pet(8L); //вызываем PET из экземпляра класса
        pet.setStatus("available");
//        pet.setCategory(); -  правильней создать категорию
        pet.category.name = "Barbos"; //можно перезадать имя и оно перетрет то что мы создали вначале
        petController.changePet(pet);           // отпрвляем на бэк, используя changePet
//        petController.remove_pet();
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
    assertEquals(info.status , "available");
    assertTrue(info.category.id == 8);
    assertEquals(info.category.name , "Barbos");
    assertEquals(info.photoUrls[0] , "http://pet8");
    assertTrue(info.tags[0].id == 8);
    assertEquals(info.tags[0].name , "Snejok");
    }

}

// как удалить питомца