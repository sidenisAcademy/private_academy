package REST_testing.Kutsenko;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet {

    public Integer id;
    public Category category;
    public String name;
    public String[] photoUrls;
    public Tags[] tags;
    public String status;

}
