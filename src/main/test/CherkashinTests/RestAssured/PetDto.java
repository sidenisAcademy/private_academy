package CherkashinTests.RestAssured;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class PetDto {
    public int id;
    public Category category;
    public String name;
    public String[] photoUrls;
    public List<Tags> tags;
    public String status;
}
