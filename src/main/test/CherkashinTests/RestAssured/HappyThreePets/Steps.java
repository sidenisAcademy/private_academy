package CherkashinTests.RestAssured.HappyThreePets;

import CherkashinTests.RestAssured.Category;
import CherkashinTests.RestAssured.PetDto;
import CherkashinTests.RestAssured.Tags;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@Slf4j
public class Steps {

    //ПЕРВЫЙ МЕТОД
    private PetDto first() {
        String[] photoUrls = {"https://photo.search", "https://search.photo"};
        Category category = new Category();
        List<Tags> tags = new ArrayList<>();
        PetDto petDtoOne = new PetDto();
        petDtoOne.setId(1);
        petDtoOne.setCategory(category);
        petDtoOne.setName("мыш");
        petDtoOne.setPhotoUrls(photoUrls);
        petDtoOne.setStatus("кродеться");
        petDtoOne.setTags(tags);
        return petDtoOne;
    }

    //ВТОРОЙ МЕТОД
    private PetDto second() {
        PetDto petDtoTwo = new PetDto(2, null, "мыш2", null, null, "тоже кродеться");
        return petDtoTwo;
    }

    //ТРЕТИЙ МЕТОД
    private PetDto third() {
        PetDto petDtoThree = PetDto
                .builder()
                .id(3)
                .category(null)
                .name("мыш3")
                .photoUrls(null)
                .tags(null)
                .status("и она кродеться")
                .build();
        return petDtoThree;
    }

    //СОЗДАТЬ И ПОЛУЧИТЬ ПО ПЕРВОМУ МЕТОДУ
    public void methodTheCreatorOne() {
        Controller firstPet = new Controller();
        PetDto petDtoOne = first();
        firstPet.creatingPet(petDtoOne);
        firstPet.gettingPet(petDtoOne.id);
    }

    //СОЗДАТЬ И ПОЛУЧИТЬ ПО ВТОРОМУ МЕТОДУ
    public void methodTheCreatorTwo() {
        Controller secondPet = new Controller();
        PetDto petDtoTwo = second();
        secondPet.creatingPet(petDtoTwo);
        secondPet.gettingPet(petDtoTwo.id);
    }

    //СОЗАТЬ И ПОЛУЧИТЬ ПО ТРЕТЬЕМУ МЕТОДУ
    public PetDto methodTheCreatorThree() {
        Controller thirdPet = new Controller();
        PetDto petDtoThree = third();
        thirdPet.creatingPet(petDtoThree);
        return thirdPet.gettingPet(petDtoThree.id);
    }

    //ИЗМЕНИТЬ ПАРАМЕТРЫ ПЕТА И ВЫЗВАТЬ ЕГО
    public void changePetParams() {
        Controller thirdPet = new Controller();
        PetDto petDtoThree = methodTheCreatorThree();
        Category category = new Category();
        category.setId(999);
        category.setName("new");
        petDtoThree.setCategory(category);
        petDtoThree.setStatus("spit");
        log.info("pet id: " + petDtoThree.id);
        thirdPet.putChanges(petDtoThree);
    }

    //ПРОВЕРИТЬ ВСЕ ПОЛЯ НОВОГО ПЕТА
    public void equalChangedPet(Integer id) {
        Controller thirdPet = new Controller();
        PetDto pet = thirdPet.gettingPet(id);
        assertEquals(pet.id, 3);
        assertEquals(pet.category.id, 999);
        assertEquals(pet.category.name, "new");
        assertEquals(pet.name, "мыш3");
        assertNull(pet.photoUrls);
        assertNull(pet.tags);
        assertEquals(pet.status, "spit");
    }
}

