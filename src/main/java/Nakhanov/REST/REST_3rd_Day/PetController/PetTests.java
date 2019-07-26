package Nakhanov.REST.REST_3rd_Day.PetController;

import org.junit.Test;

public class PetTests {
    private PetSteps petSteps = new PetSteps();

    @Test
    public void addNewPetTest() throws Exception {
        petSteps.addNewPetStep();
    }

    @Test
    public void createAndCheckIdNewPet() throws Exception {
        petSteps.addNewPetStep();
        petSteps.getPetIdStep(6699);
    }

    @Test
    public void deleteNewestPetTest() {
        petSteps.deletePetStep(6996, "");
    }

    @Test
    public void getPetByStatusTest() {
        petSteps.getPetByStatusStep(6996, "pending");
    }

    @Test
    public void updateCategoryAndStatusPetTest() {

        petSteps.updateCategoryNameAndStatusPetStep(6778, "sobaka-zabivaka", "pending");
        petSteps.getPetIdStep(6778);
    }

    @Test
    public void getPetsByStatusTest() {
        petSteps.getPetsByStatusStep("1");
    }

    @Test
    public void addNewestPetTest() {
        petSteps.addNewPetByBuilderStep(6778, "BigFoot", 33, "kakoy to pes", "available");
    }

    @Test
    public void addNewPetAndCheckPetByStatus() {
        petSteps.addNewPetByBuilderStep(6779, "Ololosh", 33,
                "Ololo category", "available");
    }

    @Test
    public void getPetByStatusAndCheckIncludingInListByStatusTest() {
        petSteps.getPetByStatusAndCheckIncludingPetIdInListStep(6779, "available");
    }

    @Test
    public void getPetByStatusAndCheckExludingInListByStatusTest() {
        petSteps.getPetByStatusAndCheckIncludingPetIdInListStep(6779, "sold");
    }

    @Test
    public void getAllTagsForAllPets(){

        petSteps.getAllPetTagsStep("pending");
        petSteps.getAllPetTagsStep("sold");
        petSteps.getAllPetTagsStep("available");
    }

    @Test
    public void getAllPhotoUrlAllPets(){

        petSteps.getAllPhotoUrlStep("pending");
        petSteps.getAllPhotoUrlStep("available");
        petSteps.getAllPhotoUrlStep("sold");
    }
}
