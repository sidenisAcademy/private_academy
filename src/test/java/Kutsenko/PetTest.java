package Kutsenko;

import Kutsenko.PetStore.PetSteps.PetSteps;
import Kutsenko.Profiles.AllTests;
import Kutsenko.Profiles.SmokeTests;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PetTest {

    @Test
    @Category(SmokeTests.class)
    public void editPetTest() {
        PetSteps.stepAddPet(604L, 111L, "string", null, null, null);
        PetSteps.stepEditPet(604L, 111L, "New category", null, null, "sold");
        PetSteps.stepCheckPetFields(604L, 111L, "New category", null, null, "sold");

    }

    @Test
    @Category(AllTests.class)
    public void checkPetExist() {

        PetSteps.stepAddPetWithBuilder(604L, 111L, "string", "doggie", null, "available");
        PetSteps.stepCheckPetIsExist(604L, "available");

    }

    @Test
    @Category(AllTests.class)
    public void checkPetNotExist() {

        PetSteps.stepAddPetWithBuilder(604L, 111L, "string", "doggie", null, "available");
        PetSteps.stepCheckPetIsNotExist(604L, "sold");

    }

    @AfterClass
    public static void cleanupPets() {
        PetSteps.stepDeletePet(604L);
    }

}
