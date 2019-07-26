package Isabekov_Rest.PetTests;

import Isabekov_Rest.PetStore.PetSteps.PetSteps;
import org.junit.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class TestPet {
    @Test
    public void firsttest() {
        PetSteps step = new PetSteps(); // создаю экземпляр классов step в этом классе
        step.createPetStep1();  // вызов метода для создания и отправки на Бэк он не статик
        step.getPetStep2();
        step.updatePetStep();
    }

}
