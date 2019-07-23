package Trefilova;

import lombok.Builder;

import java.util.List;

@Builder
public class PetDto2 {
    public int id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tags> tags;
    public String status;
}
