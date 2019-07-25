package Nakhanov.REST.REST_3rd_Day.PetController;

import Nakhanov.REST.PetDTO.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class PetSteps {

    public void addNewPetStep() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Pet pet = objectMapper.readValue(new File("src/main/resources/NewPet2.json"), Pet.class);
        PetController.addNewPetEndpoint(pet);
    }

    public void addNewPetByBuilderStep(long id, String name, String status) {
        Pet pet = Pet.builder()
                .id(id)
                .name(name)
                .status(status)
                .build();
        PetController.addNewPetEndpoint(pet);
    }

    public void getPetIdStep(long id) {
        Pet pet = PetController.getPetByIdEndpoint(id);
        assertEquals(id, pet.id);
    }

    public void deletePetStep(long id, String apikey) {
        PetController.deletePetEndpoint(id, apikey);
    }

//    public void getPetByStatusStep(int id, String status){
//        Map<String, String> map = Collections.emptyMap();
//        map.put("status", status);
//        Pet[] pet = PetController.getPetByStatusEndpoint2(map);
//
//        System.out.println(pet.length);
//    }

    public void getPetByStatus2Step(String status) {
        Pet[] pet = PetController.getPetByStatusEndpoint("sold");

        System.out.println(pet.length);
    }
}
