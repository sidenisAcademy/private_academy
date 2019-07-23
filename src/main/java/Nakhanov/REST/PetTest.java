package Nakhanov.REST;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

    Steps steps = new Steps();




    @Test
    public void checkCreateAndDeletePet(){
        steps.deletePetById(6695);
        steps.getPetID();
        int id = steps.id;

        steps.getPetById(id, 200);

    }

    @Test
    public void createPetBySettersTest(){
        Pet pet = new Pet();
        List<String> list = new ArrayList<>();
        Category category = new Category();
        category.setId(23);
        category.setName("ololo");
        Tags tags = new Tags();
        tags.setId(44);
        tags.setName("Bobo");
        List<Tags> tagList = new ArrayList<>();
        tagList.add(tags);

        pet.setId(3323);
        pet.setName("Vaska");
        pet.setStatus("sold");
        pet.setPhotoUrls(list);
        pet.setCategory(category);
        pet.setTags(tagList);

        steps.createPetBySetters1(pet);

    }

    @Test
    public void createPetByAllArgsConstructorTest(){
        Category category = new Category();
        category.setId(123);
        category.setName("ololo trololo");
        List<String> photoList = new ArrayList<>();
        Tags tags = new Tags();
        tags.setId(44);
        tags.setName("Bobo");
        List<Tags> tagList = new ArrayList<>();
        tagList.add(tags);
        photoList.add("Photo dlya laykov");

        Pet pet = new Pet(3337, category, "Pes Barbos", photoList, tagList, "sold" );

        steps.createPetByAllArgsConstructor(pet);
    }

    @Test
    public void createPetByUsingBuilderTest(){
        Pet pet = Pet.builder()
                .id(3335)
                .name("Sobaka sutulaya")
                .status("available")
                .build();

        steps.createPetByUsingBuilder(pet);

    }
}
