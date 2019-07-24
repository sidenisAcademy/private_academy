package REST_testing.Kutsenko;

import com.jayway.restassured.response.Header;

import java.util.List;

public class PetSteps {

    static Integer stepAddPet(Integer id) {

        Integer newId = PetController.addPet(id);
        return newId;

    }

    static void stepGetPetById(Integer id) {

        List<Header> heders = PetController.getPetById(id);
        for (Header heder : heders) {
            System.out.println(heder);
        }

    }

    static void stepDeletePet(Integer id) {

        PetController.deletePet(id);

    }

    static void stepCheckPetNotFound(Integer id) {

        PetController.checkPetNotFound(id);

    }

    static void stepUserLogin(String login, String password) {

        String resp = PetController.userLogin(login, password);
        System.out.println(resp);

    }

    static void stepUserAuth(String login, String password) {

        String resp = PetController.userAuth(login, password);
        System.out.println(resp);

    }

    static void stepRegisterSimpleServer(String email, String password) {

        String resp = PetController.registerSimpleServer(email, password);
        System.out.println(resp);

    }

    static String stepAuthSimpleServer(String email, String password) {

        return PetController.authSimpleServer(email, password);

    }

    static void stepGetProtected(String token) {

        String msg = PetController.getProtected(token);
        System.out.println(msg);

    }

    static Integer stepAddPetWithSetter() {

        Category category = new Category();
        category.setId(111);
        category.setName("New category");

        Pet newPet = new Pet();
        newPet.setId(777);
        newPet.setCategory(category);
        newPet.setName("Cat");
        newPet.setPhotoUrls(null);
        newPet.setTags(null);
        newPet.setStatus("available");

        Integer newId = PetController.addPetWithPet(newPet);
        return newId;

    }

    static Integer stepAddPetWithAllArgsConstructor() {

        Category category = new Category();
        category.setId(111);
        category.setName("New category");

        Pet newPet = new Pet(777, category, "Cat", null, null, "available");

        Integer newId = PetController.addPetWithPet(newPet);
        return newId;

    }

    static Integer stepAddPetWithBuilder() {

        Category category = new Category();
        category.setId(111);
        category.setName("New category");

        Pet newPet = Pet.builder().id(777).category(category).name("Cat").photoUrls(null).tags(null).status("available").build();

        Integer newId = PetController.addPetWithPet(newPet);
        return newId;

    }
}
