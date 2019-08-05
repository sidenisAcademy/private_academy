package Trefilova.PetStore.PetSteps.PetModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetList {
    public List<Pet> pet;
}
