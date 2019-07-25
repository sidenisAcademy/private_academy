package REST_testing.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PUBLIC)
public class PetDto {
    long id;
    DescriptionDto category;
    String name;
    List<String> photoUrls;
    List<DescriptionDto> tags;
    String status;
}
