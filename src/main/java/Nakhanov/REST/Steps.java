package Nakhanov.REST;

import lombok.extern.slf4j.Slf4j;

import static Nakhanov.REST.Controller.*;

@Slf4j
public class Steps {

    int id;
    public void getPetById(int id, int code){
        String str = petRequestById(id, code);
        log.info("ololo " +   str);
    }


    public  void getPetID(){

        Pet pet = createPet();
        id =  pet.id;


    }

    public  void deletePetById(int id)
    {
        deletePet(id);
    }


    public void createPetBySetters1(Pet pet){
        createPetByDiffWays(pet);
    }

    public void createPetByAllArgsConstructor(Pet pet){
        createPetByDiffWays(pet);
    }

    public void createPetByUsingBuilder(Pet pet){
        createPetByDiffWays(pet);
    }
}
