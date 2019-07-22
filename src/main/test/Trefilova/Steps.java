package Trefilova;

import static Trefilova.Controller.*;

public class Steps {
    public Integer petId;

    public void createPetTest() {
        petId = createPet();
        System.out.println("New pet is created");
    }

    public void requestTestId200() {
        requestById(petId);
    }

    public void requestTestId404() {
        requestById(petId, 404);
    }

    public void requestTestStatus() {
        requestByStatus();
    }

    public void deletePetTest() {
        deletePet(petId);
    }
}
