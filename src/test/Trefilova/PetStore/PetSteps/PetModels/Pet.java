package PetStore.PetSteps.PetModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Setter;

import java.util.List;

@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {
    public long id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tags> tags;
    public String status;

}
