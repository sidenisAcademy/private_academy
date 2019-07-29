package REST_testing.Kutsenko.PetStore.PetTests;

import REST_testing.Kutsenko.PetStore.PetSteps.PetSteps;
import org.junit.AfterClass;
import org.junit.Test;

public class PetTest {

    @Test
    public void editPetTest() {
        PetSteps.stepAddPet(604L, 111L, "string", null, null, null);
        PetSteps.stepEditPet(604L, 111L, "New category", null, null, "sold");
        PetSteps.stepCheckPetFields(604L, 111L, "New category", null, null, "sold");

    }

    @Test
    public void checkPetExist() {

        PetSteps.stepAddPetWithBuilder(604L, 111L, "string", "doggie", null, "available");
        PetSteps.stepCheckPetIsExist(604L, "available");

    }

    @Test
    public void checkPetNotExist() {

        PetSteps.stepAddPetWithBuilder(604L, 111L, "string", "doggie", null, "available");
        PetSteps.stepCheckPetIsNotExist(604L, "sold");

    }

    @AfterClass
    public static void cleanupPets() {
        PetSteps.stepDeletePet(604L);
    }

}
