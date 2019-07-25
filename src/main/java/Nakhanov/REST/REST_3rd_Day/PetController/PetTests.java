package Nakhanov.REST.REST_3rd_Day.PetController;

import org.junit.Test;

public class PetTests {
    private PetSteps petSteps = new PetSteps();

    @Test
    public void addNewPetTest() throws Exception{
        petSteps.addNewPetStep();
    }

    @Test
    public void createAndCheckIdNewPet()throws Exception{
        petSteps.addNewPetStep();
        petSteps.getPetIdStep(6699);
    }

    @Test
    public void addNewestPetTest(){
        petSteps.addNewPetByBuilderStep(6996, "BigFoot", "available");
        petSteps.getPetIdStep(6996);
    }

    @Test
    public void deleteNewestPetTest(){
        petSteps.deletePetStep(6996, "");
    }

//    @Test
//    public void getPetByStatusTest(){
//        petSteps.getPetByStatusStep(6996, "pending");
//    }

    @Test
    public void getPetByStatus2Test(){
        petSteps.getPetByStatus2Step("sold");
    }
}
