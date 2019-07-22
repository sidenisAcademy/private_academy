package Nakhanov.REST;

import org.junit.Test;

public class PetTest {

    Steps steps = new Steps();



    @Test
    public void checkCreateAndDeletePet(){
        steps.deletePetById(6695);
        steps.getPetID();
        int id = steps.id;

        steps.getPetById(id, 200);

    }
}
