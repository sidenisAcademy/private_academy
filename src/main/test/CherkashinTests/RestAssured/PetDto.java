package CherkashinTests.RestAssured;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class PetDto {
    public int id;
    public Category category;
    public String name;
    public String[] photoUrls;
    public List<Tags> tags;
    public String status;
}
