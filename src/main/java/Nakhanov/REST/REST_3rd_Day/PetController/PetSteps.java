package Nakhanov.REST.REST_3rd_Day.PetController;

import Nakhanov.REST.PetDTO.Category;
import Nakhanov.REST.PetDTO.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class PetSteps {

    public void addNewPetStep() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Pet pet = objectMapper.readValue(new File("src/main/resources/NewPet2.json"), Pet.class);
        PetController.addNewPetEndpoint(pet);
    }

    private Category categoryInitialise(long id, String name) {
        return Category.builder()
                .id(id)
                .name(name)
                .build();

    }

    public void addNewPetByBuilderStep(long id, String petName, long catId, String catName, String status) {
        Pet pet = Pet.builder()
                .id(id)
                .name(petName)
                .category(categoryInitialise(catId, catName))
                .status(status)
                .build();
        PetController.addNewPetEndpoint(pet);
    }

    public void getPetIdStep(long id) {
        Pet pet = PetController.getPetByIdEndpoint(id);
        assertEquals(id, pet.id);

    }

    public void deletePetStep(long id, String apikey) {
        PetController.deletePetEndpoint(id, apikey);
    }

    public void updateCategoryNameAndStatusPetStep(long id, String categoryName, String status) {
        Pet pet = PetController.getPetByIdEndpoint(id);
        pet.category.name = categoryName;
        pet.status = status;
        PetController.putPetEndpoint(pet);
        pet = PetController.getPetByIdEndpoint(id);
        assertEquals(categoryName, pet.category.name);
        assertEquals(status, pet.status);

    }

    public void getPetByStatusStep(long id, String status) {
        Map<String, String> map = Collections.emptyMap();
        map.put("status", status);
        Pet[] pet = PetController.getPetByStatusEndpoint2(map);

        System.out.println(pet.length);
    }

    public void getPetByStatusAndCheckIncludingPetIdInListStep(long id, String status) {
        Pet[] pet = PetController.getPetByStatusEndpoint(status);
        for (Pet pet1 : pet) {
            if (pet1.id == id) {
                assertEquals(pet1.status, status);

                System.out.println("Your pet is exists in " + status + " list with #" + pet1.id);
            }
        }
        System.out.println("Your pet isn't found");
    }

    public void getPetsByStatusStep(String status) {
        Pet[] pet = PetController.getPetByStatusEndpoint(status);
        System.out.println(pet.length);
    }

    public void getAllPetTagsStep(String status) {
        Pet[] pet = PetController.getPetByStatusEndpoint(status);

        List<Pet> petList = Arrays.asList(pet);
        System.out.println(pet.length);

        petList.stream()
                .filter(pet1 -> pet1.tags != null)
                .map(pet1 -> pet1.tags)
                .filter(t -> !t.isEmpty())
                .flatMap(tags -> tags.stream())
                .filter(tags -> tags != null)
                .forEach(tag1 -> System.out.println(tag1.id + " " + tag1.name));
    }

    public void getAllPhotoUrlStep(String status) {
        Pet[] pet = PetController.getPetByStatusEndpoint(status);

        List<Pet> petList = Arrays.asList(pet);
        System.out.println(pet.length);

        petList.stream()
                .filter(pet1 -> pet1.photoUrls != null)
                .peek(pet1 -> System.out.println(pet1.id))
                .map(pet1 -> pet1.photoUrls)
                .forEach(photo -> System.out.println(photo));
    }
}

