package Kutsenko;

import org.junit.Test;

public class TestRequests {

    @Test
    public void requestTest() {

        Integer newId = PetSteps.stepAddPet(604);
        PetSteps.stepGetPetById(newId);
        PetSteps.stepDeletePet(newId);
        PetSteps.stepCheckPetNotFound(newId);

        PetSteps.stepUserLogin("me", "123");
        PetSteps.stepUserAuth("me1", "456");

//        PetSteps.stepRegisterSimpleServer("me1", "456");
        String token = PetSteps.stepAuthSimpleServer("me1", "456");
        PetSteps.stepGetProtected(token);

        Integer newPetWithSetterId = PetSteps.stepAddPetWithSetter();
        PetSteps.stepGetPetById(newPetWithSetterId);
        PetSteps.stepDeletePet(newPetWithSetterId);

        Integer newPetWithAllArgsConstructor = PetSteps.stepAddPetWithAllArgsConstructor();
        PetSteps.stepGetPetById(newPetWithAllArgsConstructor);
        PetSteps.stepDeletePet(newPetWithAllArgsConstructor);

        Integer newPetWithBuilder = PetSteps.stepAddPetWithBuilder();
        PetSteps.stepGetPetById(newPetWithBuilder);
        PetSteps.stepDeletePet(newPetWithBuilder);

    }
}
