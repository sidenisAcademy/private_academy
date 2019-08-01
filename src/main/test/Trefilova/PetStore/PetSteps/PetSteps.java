package Trefilova.PetStore.PetSteps;

import Trefilova.PetStore.PetSteps.PetModels.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static Trefilova.PetStore.PetController.PetController.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PetSteps {

    private static Pet pet = new Pet();
    private static Category category = new Category();
    private static List<String> photoUrls = new ArrayList<>();
    private static Tags tag1 = new Tags();
    private static Tags tag2 = new Tags();
    private static List<Tags> tagsList = new ArrayList<>();

    public static void addNewPetStep(long id, String name, long categoryId, String categoryName, String status) {

        category.id = categoryId;
        category.name = categoryName;

        photoUrls.add("url1");
        photoUrls.add("url2");

        tag1.id = 1;
        tag1.name = "tag1";
        tag2.id = 2;
        tag2.name = "tag2";

        tagsList.add(tag1);
        tagsList.add(tag2);

        pet.setId(id);
        pet.setCategory(category);
        pet.setName(name);
        pet.setPhotoUrls(photoUrls);
        pet.setTags(tagsList);
        pet.setStatus(status);

        if(isPetExists(pet.id)) {
            updatePet(pet);
        } else {
            addNewPet(pet);
        }
        System.out.println("New pet is created\nID: " + pet.id + ", Name: " + pet.name + ", Category: " + pet.category.name + ", Status: " + pet.status);
    }

    public static void updatePetStep() {
        category.name = "Dog";
        pet.setCategory(category);
        pet.setStatus("sold");

        updatePet(pet);
        System.out.println("Pet is updated");
    }

    public static void findPetByIdStepStatus200() {
        findPetById(pet.id);
        System.out.println("Found pet\nID: " + pet.id + ", Category: " + pet.category.name + ", Name: " + pet.name + ", Photo URLs: " + pet.photoUrls + ", Tags: " + tagsList.get(1).id + " " + tagsList.get(1).name +  ", Status: " + pet.status);
    }

    public static void findPetByIdStepStatus400() {
        findPetById(pet.id, 404);
    }

    public static void findPetByStatusStep(String status) {
        findPetByStatus(status);
    }

    public static void deletePetStep() {
        deletePet(pet.id);
    }

    public static void checkPet() {
        assertEquals(pet.id, 100);
        assertEquals(pet.name, "Chelsea");
        assertEquals(pet.category.name, "Dog");
        assertEquals(pet.status, "sold");
    }

    public static void checkIfPetExists(long id, String name, String category, String status) {
        List<Pet> pet = findPetByStatus(status);
        for(Pet p : pet) {
            if(p.id == id) {
                assertEquals(p.name, name);
                assertEquals(p.category.name, category);
                System.out.println("This pet exists " + p.id + " " + p.name);
            }
//            else
//                System.out.println("This pet doesn't exist");
        }
    }

    public static List<Pet> findAllPetsByStatusesStep() {
        List<Pet> allPets = findPetByStatus("available");
        allPets.addAll(findPetByStatus("sold"));
        allPets.addAll(findPetByStatus("pending"));
        return allPets;
    }

    public static void findAllTagsStep(List<Pet> pets) {
        for (Pet pet : pets) {
            if(pet.tags != null && !pet.tags.isEmpty()) {
                System.out.println("Pet ID: " + pet.id);
                for(Tags tag : pet.tags) {
                    if(tag != null)
                        System.out.println(tag.id + " " + tag.name);
                }
            }
        }
    }

    public static void findAllPhotoUrlsStep(List<Pet> pets) {
        for (Pet pet : pets) {
            if(pet.photoUrls != null && !pet.photoUrls.isEmpty()) {
                System.out.println("Pet ID: " + pet.id);
                for(String photoUrl : pet.photoUrls) {
                    if(photoUrl != null)
                        System.out.println(photoUrl);
                }
            }
        }
    }
}
