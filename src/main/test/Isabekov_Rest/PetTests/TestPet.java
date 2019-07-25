package Isabekov_Rest.PetTests;

import Isabekov_Rest.PetStore.PetSteps.PetSteps;
import org.junit.Test;

public class TestPet {
    @Test
    public void firsttest() {
        PetSteps step = new PetSteps(); // создаю экземпляр классов step в этом классе
        step.createPetStep();  // вызов метода для создания и отправки на Бэк
    }
}
