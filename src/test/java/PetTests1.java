import Trefilova.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static Trefilova.PetStore.PetSteps.PetSteps.*;


public class PetTests1 {

    @Test
    @Category(Smoke.class)
    public void TestPet1() {
        addNewPetStep(100,"Chelsea", 1, "Dog", "sold");
        updatePetStep();
        findPetByIdStepStatus200();
        checkPet();
    }
//
//    @TestK
//    public void TestPet2() {
//        addNewPetStep(202,"Pharaon", 2, "Cat", "available");
//        findPetByStatusStep("available");
//        checkIfPetExists(202,"Pharaon", "Cat", "available");
//    }
//
//    @Test
//    public void TestPet3() {
//        addNewPetStep(102,"Gavryusha", 3, "Cow", "available");
//        findPetByStatusStep("sold");
//        checkIfPetExists(102,"Gavryusha", "Cow", "sold");
//    }
//
//    @Test
//    public void TestPet4() {
//        findAllTagsStep(findAllPetsByStatusesStep());
//    }
//
//    @Test
//    public void TestPet5() {
//        findAllPhotoUrlsStep(findAllPetsByStatusesStep());
//    }
}
