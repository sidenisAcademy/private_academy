package Isabekov.Day6;

import lombok.Getter;

@Getter //обращается ко всем свойствам и get  -далее все значения будут передаваться
public class PetDto {
int id;
public Category category; //публичное поле класс, которое имеет тип Кат и имя кат
String name;
public String[] photoUrls;
public Category[] tags; // Category в этом случае представляется как массив
String status;
}
