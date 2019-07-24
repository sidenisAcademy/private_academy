package Trefilova.PetStore.PetTests;

import Trefilova.PetStore.PetSteps.PetSteps;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

@Slf4j
public class PetTests {
    PetSteps step;

    @Before
    public void createStep() {
        step = new PetSteps();
    }

    @Test
    public void TestPet1() {
        step.addNewPetStep();
        step.updatePetStep();
        step.findPetByIdStepStatus200();
        step.checkPet();
    }

    @Test
    public void TestPet2() {
        step.addNewPetStep();
        step.findPetByStatusStep();
        step.checkIfPetExists();
    }

    @Test
    public void TestPet3() {
        step.addNewPetStep();
        step.findPetByStatusStep();
    }

    @Test
    public void TestPet4() {

    }

    @Test
    public void TestPet5() {

    }
}
