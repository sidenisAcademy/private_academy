package CherkashinTests.RestAssured.ControllerStepsTest;

import CherkashinTests.RestAssured.PetDto;

public class Steps {
    public void CreatePet() {
        PetDto petdto = new PetDto();
        petdto.id = 0;
        petdto.name = "Sharik";

    }
}

