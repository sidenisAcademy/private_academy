package PetController_Cherednik.PetStore.PetStore;

import PetController_Cherednik.PetStore.PetController.Controller;
import REST_testing.Category;
import REST_testing.PetDto;
import REST_testing.Tags;
import org.junit.Test;

public class Steps {
    public void CreatePet() {
        PetDto petdto = new PetDto();
        petdto.id = 0;
        petdto.name = "Sharik";
    }

    public static class Model {    public int id;
        public Category category;
        public String name;
        public String[] photoUrls;
        public Tags[] tags;
        public String status;
    }

    public static class Tests extends Controller {
        @Test
        public void requesttest() {
            Integer id = PostPet();
            GetPet(id);
            DelPet(id);
            GetDeletedPet(id);
        }
    }
}

