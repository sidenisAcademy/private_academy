package Isabekov_Rest.PetStore.PetSteps.PetModels;

import Isabekov.Day6.Category;
import lombok.Getter;
import lombok.Setter;

@Getter //обращается ко всем свойствам и get  -далее все значения будут передаваться
@Setter
public class PetDto {
    public int id;
    public Category category; //публичное поле класс, которое имеет тип Кат и имя кат public String name;
    public String[] photoUrls;
    public Category[] tags; // Category в этом случае представляется как массив
    public String status;
}
