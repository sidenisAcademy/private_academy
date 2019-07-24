package REST_testing.Kutsenko.PetStore.PetTests;

import REST_testing.Kutsenko.PetStore.PetSteps.PetSteps;
import org.junit.Test;

public class PetTest {

    // TODO add after

    @Test
    public void editPetTest() {

        PetSteps.stepAddPet(604, 111, "string", null, null, null);
//        PetSteps.stepEditPet(604, 111, "New category", "doggie", null, null, "available"); TODO add param tags
        PetSteps.stepEditPet(604, 111, "New category", null, null, "sold");
        PetSteps.stepGetPetById(604);
        PetSteps.stepCheckPetFields(604, 111, "New category", null, null, "sold");

    }

    @Test
    public void checkPetExist() {

        PetSteps.stepAddPetWithBuilder(605, 112, "string", "doggie", null, "available");
        PetSteps.stepGetPetsByStatus("available");
        PetSteps.stepCheckPetIsExist(605, 112, "string", "doggie", "available");

    }

    @Test
    public void checkPetNotExist() {

        PetSteps.stepAddPetWithBuilder(606, 112, "string", "doggie", null, "available");
        PetSteps.stepGetPetsByStatus("sold");
        //PetSteps.stepCheckPetIsNotExist(606, 112, "string", "doggie", "sold"); TODO add step stepCheckPetIsNotExist

    }
}
