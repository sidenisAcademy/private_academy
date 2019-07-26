package Trefilova.PetStore.PetTests;

import Trefilova.PetStore.PetSteps.PetSteps;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static Trefilova.PetStore.PetSteps.PetSteps.*;
import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetTests {

    @Test
    public void TestPet1() {
        addNewPetStep(100,"Chelsea", 1, "Dog", "sold");
        updatePetStep();
        findPetByIdStepStatus200();
        checkPet();
    }

    @Test
    public void TestPet2() {
        addNewPetStep(101,"Pharaon", 2, "Cat", "available");
        findPetByStatusStep("available");
        checkIfPetExists(101,"Pharaon", "Cat", "available");
    }

    @Test
    public void TestPet3() {
        addNewPetStep(102,"Gavryusha", 3, "Cow", "available");
        findPetByStatusStep("sold");
        checkIfPetExists(102,"Gavryusha", "Cow", "sold");
    }

    @Test
    public void TestPet4() {
        findAllTagsStep(findAllPetsByStatusesStep());
    }

    @Test
    public void TestPet5() {
        findAllPhotoUrlsStep(findAllPetsByStatusesStep());
    }
}
