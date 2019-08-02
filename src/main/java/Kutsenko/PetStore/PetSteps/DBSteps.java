package Kutsenko.PetStore.PetSteps;

import Kutsenko.PetStore.PetControllers.DBController;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;

public class DBSteps {

    public static void stepAddPet(String name, String type, String gender, Boolean status) {
        DBController.addPetToBase(name, type, gender, status);
    }

    public static void stepSelectPet(String name) {
        HashMap<String, String> pet = DBController.selectPetByNameFromBase(name);
        System.out.println(pet.get("data"));
    }

    public static void stepChangePetName(String oldName, String newName) {
        HashMap<String, String> pet = DBController.selectPetByNameFromBase(oldName);
        Integer id = Integer.valueOf(pet.get("id"));
        DBController.updatePetNameById(id, newName);
    }

    public static void stepDeletePet(String name) {
        DBController.deletePetByNameFromBase(name);
    }

    public static String stepGenerateRandomString() {
        String str = RandomStringUtils.randomAlphabetic(10);
        System.out.println(str);
        return str;
    }

}
