package Nakhanov.REST;

import lombok.extern.slf4j.Slf4j;

import static Nakhanov.REST.Controller.createPet;
import static Nakhanov.REST.Controller.deletePet;
import static Nakhanov.REST.Controller.petRequestById;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
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
}
