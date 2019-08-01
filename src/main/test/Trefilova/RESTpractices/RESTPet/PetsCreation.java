//package Trefilova.RESTpractices;
//
//import Trefilova.PetStore.PetSteps.PetSteps.PetModels.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PetsCreation {
//    public void main() {
//
//        Pet pet1 = new Pet();
//
//        Categories category = new Categories();
//        category.id = 1;
//        category.name = "Cat";
//
//        List<String> photoUrls = new ArrayList<>();
//        photoUrls.add("url1");
//        photoUrls.add("url2");
//
//        Tags tag = new Tags();
//        tag.id = 0;
//        tag.name = "tag";
//
//        List<Tags> tagsList = new ArrayList<>();
//
//
//        pet1.setId(15);
//        pet1.setCategory(category);
//        pet1.setName("Vasiliy");
//        pet1.setPhotoUrls(photoUrls);
//        pet1.setTags(tagsList);
//        pet1.setStatus("available");
//
//        PetDto1 petDto1 = new PetDto1(2, category, "Cheburashka", photoUrls, tagsList, "sold");
//
//        PetDto2 petDto2 = PetDto2.builder().id(20).category(category).name("Jessy").photoUrls(photoUrls).tags(tagsList).status("available").build();
//
//
//    }
//}
