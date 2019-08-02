package PetStore.PetSteps.PetModels;

import Trefilova.PetStore.PetSteps.PetModels.Pet;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetList {
    public List<Pet> pet;
}
