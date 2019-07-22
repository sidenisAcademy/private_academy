package REST_testing.Kutsenko;

public class PetSteps {

    static Integer stepOne(Integer id) {

        Integer newId = PetController.addPet(id);
        return newId;

    }

    static void stepTwo(Integer id) {

        PetController.getPetById(id);

    }

    static void stepThree(Integer id) {

        PetController.deletePet(id);

    }

    static void stepFour(Integer id) {

        PetController.checkPetNotFound(id);

    }

}
