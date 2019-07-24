package Trefilova.PetStore.PetSteps;

import Trefilova.PetStore.PetSteps.PetModels.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static Trefilova.PetStore.PetController.PetController.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;

public class PetSteps {

    Pet pet = new Pet();
    Category category = new Category();
    List<String> photoUrls = new ArrayList<>();
    Tags tag1 = new Tags();
    Tags tag2 = new Tags();
    List<Tags> tagsList = new ArrayList<>();

    public void addNewPetStep() {

        category.id = 1;
        category.name = "Cat";

        photoUrls.add("url1");
        photoUrls.add("url2");

        tag1.id = 1;
        tag1.name = "tag1";
        tag2.id = 2;
        tag2.name = "tag2";

        tagsList.add(tag1);
        tagsList.add(tag2);

        pet.setId(15);
        pet.setCategory(category);
        pet.setName("Vasiliy");
        pet.setPhotoUrls(photoUrls);
        pet.setTags(tagsList);
        pet.setStatus("available");

        addNewPet(pet);
        System.out.println("New pet is created\nID: " + pet.id + ", Name: " + pet.name + ", Category: " + pet.category.name + ", Status: " + pet.status);
    }

    public void updatePetStep() {
        category.name = "Dog";
        pet.setCategory(category);
        pet.setStatus("sold");

        updatePet(pet);
        System.out.println("Pet is updated");
    }

    public void findPetByIdStepStatus200() {
        findPetById(pet.id);
        System.out.println("Found pet\nID: " + pet.id + ", Category: " + pet.category.name + ", Name: " + pet.name + ", Photo URLs: " + pet.photoUrls + ", Tags: " + tagsList.get(1).id + " " + tagsList.get(1).name +  ", Status: " + pet.status);
    }

    public void findPetByIdStepStatus400() {
        findPetById(pet.id, 404);
    }

    public void findPetByStatusStep() {
        findPetByStatus("available");
    }

    public void deletePetStep() {
        deletePet(pet.id);
    }

    public void checkPet() {
        Assert.assertEquals(java.util.Optional.ofNullable(pet.id), 15);
        Assert.assertEquals(pet.name, "Vasiliy");
        Assert.assertEquals(pet.category.name, "Dog");
        Assert.assertEquals(pet.status, "sold");
    }

    public void checkIfPetExists() {
        List<Pet> pet = findPetByStatus("available");
        Assert.assertThat(pet, containsInAnyOrder(hasProperty("id", is(15))));
    }
}
