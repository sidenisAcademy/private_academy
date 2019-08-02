package Kutsenko.PetStore.PetSteps;

import Kutsenko.PetStore.PetSteps.PetModels.CategoryOrTags;
import Kutsenko.PetStore.PetSteps.PetModels.PetDto;
import Kutsenko.PetStore.PetControllers.PetController;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@Slf4j
public class PetSteps {

    public static void stepAddPet(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {
        String strPhotoUrls = null;
        if (photoUrls != null) {
            strPhotoUrls = "[ \"" + String.join("\", \"", photoUrls) + "\" ]";
        }
        String bodyJson = "{ \"id\": "
                + petId + ", \"category\": { \"id\": "
                + categoryId + ", \"name\": \""
                + categoryName + "\" }, \"name\": \""
                + petName + "\", \"photoUrls\": "
                + strPhotoUrls + ", \"tags\": null, \"status\": \""
                + petName + "\"}";
        PetController.addPet(bodyJson);

    }

    public static void stepEditPet(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        PetDto modifiedPet = new PetDto(petId, category, petName, photoUrls, null, status);

        PetController.editPet(modifiedPet);

    }

    public static void stepGetPetById(Long id) {

        PetController.getPetById(id);

    }

    public static void stepCheckPetFields(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        PetDto petById = PetController.getPetById(petId);

        assertEquals(petById.category.id, categoryId);
        assertEquals(petById.category.name, categoryName);
        assertEquals(petById.name, petName);
        assertArrayEquals(petById.photoUrls, photoUrls);
        assertArrayEquals(petById.tags, null);
        assertEquals(petById.status, status);

    }


    public static void stepDeletePet(Long id) {

        PetController.deletePet(id);

    }

    public static void stepCheckPetNotFound(Long id) {

        PetController.checkPetNotFound(id);

    }

    public static void stepAddPetWithSetter(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        PetDto newPet = new PetDto();
        newPet.setId(petId);
        newPet.setCategory(category);
        newPet.setName(petName);
        newPet.setPhotoUrls(photoUrls);
        newPet.setTags(null);
        newPet.setStatus(status);

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepAddPetWithAllArgsConstructor(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        PetDto newPet = new PetDto(petId, category, petName, photoUrls, null, status);

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepAddPetWithBuilder(Long petId, Long categoryId, String categoryName, String petName, String[] photoUrls, String status) {

        CategoryOrTags category = new CategoryOrTags();
        category.setId(categoryId);
        category.setName(categoryName);

        PetDto newPet = PetDto.builder().id(petId).category(category).name(petName).photoUrls(photoUrls).tags(null).status(status).build();

        PetController.addPetWithPetInstance(newPet);

    }

    public static void stepGetPetsByStatus(String status) {

        PetController.getPetsByStatus(status);

    }

    public static void stepCheckPetIsExist(Long petId, String status) {

        PetDto myPet = PetController.getPetById(petId);
        List<PetDto> arPets = PetController.getPetsByStatus(status);
        Boolean isExist = false;
        for (PetDto pet : arPets) {
            if (
                    myPet.id.equals(pet.id) &&
                            myPet.category.id.equals(pet.category.id) &&
                            myPet.category.name.equals(pet.category.name) &&
                            myPet.name.equals(pet.name) &&
                            myPet.status.equals(pet.status)
                    ) {
                isExist = true;
                break;
            }
        }
        assertTrue("Pet with status available is not in array Pets with status available", isExist);

    }


    public static void stepCheckPetIsNotExist(Long petId, String status) {

        PetDto myPet = PetController.getPetById(petId);
        List<PetDto> arPets = PetController.getPetsByStatus(status);
        Boolean isExist = false;
        for (PetDto pet : arPets) {
            if (
                    myPet.id.equals(pet.id) &&
                            myPet.category.id.equals(pet.category.id) &&
                            myPet.category.name.equals(pet.category.name) &&
                            myPet.name.equals(pet.name) &&
                            myPet.status.equals(pet.status)
                    ) {
                isExist = true;
                break;
            }
        }
        assertFalse("Pet with status available is in array Pets with status sold", isExist);

    }
}