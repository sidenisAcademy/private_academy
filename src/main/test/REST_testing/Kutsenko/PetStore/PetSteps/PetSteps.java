package REST_testing.Kutsenko.PetStore.PetSteps;

import REST_testing.Kutsenko.PetStore.PetSteps.PetModels.CategoryOrTags;
import REST_testing.Kutsenko.PetStore.PetSteps.PetModels.Pet;
import REST_testing.Kutsenko.PetStore.PetControllers.PetController;
import com.jayway.restassured.response.Header;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PetSteps {

    public static void stepAddPet(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        String bodyJson = "{ \"id\": " + petId + ", \"category\": { \"id\": " + categoryId + ", \"name\": " + categoryName + " }, \"name\": " + petName + ", \"photoUrls\": " + photoUrls + ", \"tags\": null, \"status\": " + petName + "}";
        PetController.addPet(bodyJson);

    }

    public static void stepEditPet(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        Pet modifiedPet = new Pet(petId, category, petName, photoUrls, null, status);

        PetController.editPet(modifiedPet);

    }

    public static void stepGetPetById(Integer id) {

        PetController.getPetById(id);

    }

    public static void stepCheckPetFields(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        Pet petById = PetController.getPetById(petId);
        assertEquals(petById.category.id, categoryId);
        assertEquals(petById.category.name, categoryName);
        assertEquals(petById.name, petName);
        assertArrayEquals(petById.photoUrls, photoUrls);
        assertArrayEquals(petById.tags,null);
        assertEquals(petById.status, status);

    }


    public static void stepDeletePet(Integer id) {

        PetController.deletePet(id);

    }

    public static void stepCheckPetNotFound(Integer id) {

        PetController.checkPetNotFound(id);

    }

    public static void stepAddPetWithSetter(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        Pet newPet = new Pet();
        newPet.setId(petId);
        newPet.setCategory(category);
        newPet.setName(petName);
        newPet.setPhotoUrls(photoUrls);
        newPet.setTags(null);
        newPet.setStatus(status);

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepAddPetWithAllArgsConstructor(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        Pet newPet = new Pet(petId, category, petName, photoUrls, null, status);

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepAddPetWithBuilder(Integer petId, Integer categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        Pet newPet = Pet.builder().id(petId).category(category).name(petName).photoUrls(photoUrls).tags(null).status(status).build();

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepGetPetsByStatus(String status) {

       PetController.getPetsByStatus(status);

    }


    public static void stepCheckPetIsExist(Integer petId, Integer categoryId, String categoryName, String petName, String status) {

        Pet[] arPets = PetController.getPetsByStatus(status);

        // TODO add assert

    }

}