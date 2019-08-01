package Nakhanov.REST.PetDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Pet {


    public long id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tags> tags;
    public String status;
}
