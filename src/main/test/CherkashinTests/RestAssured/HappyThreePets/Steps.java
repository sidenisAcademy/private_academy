package CherkashinTests.RestAssured.HappyThreePets;

import CherkashinTests.RestAssured.Category;
import CherkashinTests.RestAssured.PetDto;
import CherkashinTests.RestAssured.Tags;

import java.util.ArrayList;
import java.util.List;

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
        firstPet.gettingPet(petDtoOne);
    }

//СОЗДАТЬ И ПОЛУЧИТЬ ПО ВТОРОМУ МЕТОДУ
    public void methodTheCreatorTwo() {
        Controller secondPet = new Controller();
        PetDto petDtoTwo = second();
        secondPet.creatingPet(petDtoTwo);
        secondPet.gettingPet(petDtoTwo);
    }

//СОЗАТЬ И ПОЛУЧИТЬ ПО ТРЕТЬЕМУ МЕТОДУ
    public void methodTheCreatorThree() {
        Controller thirdPet = new Controller();
        PetDto petDtoThree = third();
        thirdPet.creatingPet(petDtoThree);
        thirdPet.gettingPet(petDtoThree);
    }

}

