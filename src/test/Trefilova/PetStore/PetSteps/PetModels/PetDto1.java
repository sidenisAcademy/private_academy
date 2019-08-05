package PetStore.PetSteps.PetModels;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class PetDto1 {
    public Integer id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tags> tags;
    public String status;
}
