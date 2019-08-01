package Nakhanov.REST.REST_1st_Day;

import Nakhanov.REST.PetDTO.Pet;
import lombok.extern.slf4j.Slf4j;

import static Nakhanov.REST.REST_1st_Day.Controller.*;

@Slf4j
public class Steps {

    long id;

    public void getPetById(long id, int code) {
        String str = petRequestById(id, code);
        log.info("ololo " + str);
    }


    public void getPetID() {

        Pet pet = createPet();
        id = pet.id;


    }

    public void deletePetById(int id) {
        deletePet(id);
    }


    public void createPetBySetters1(Pet pet) {
        createPetByDiffWays(pet);
    }

    public void createPetByAllArgsConstructor(Pet pet) {
        createPetByDiffWays(pet);
    }

    public void createPetByUsingBuilder(Pet pet) {
        createPetByDiffWays(pet);
    }
}
