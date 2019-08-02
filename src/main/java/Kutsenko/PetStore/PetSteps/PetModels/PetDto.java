package Kutsenko.PetStore.PetSteps.PetModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PetDto {

    public Long id;
    public CategoryOrTags category;
    public String name;
    public String[] photoUrls;
    public CategoryOrTags[] tags;
    public String status;

}
