package Olga;


import static Olga.DbConnection.*;

public class Main {

    public static void main(String[] args) {


        //insert animals
        dbInsert("Bunny", "rabbit", "male", true);
        dbInsert("Richy", "dog", "male", true);

        //print my animals
        System.out.println("\nAnimals added:");
        selectByName("name", "'Bunny', 'Richy'");
        //selectById("name", "1,2");

        System.out.println("--------------------------------------------------------------");

        //update pet name
        changeName("Bunny", "Bunny_1");
        System.out.println("Pet name updated, new pet list:");


        //print all
        selectQuery("*");
        System.out.println("--------------------------------------------------------------");

        //delete my pets
        deleteByName ("Bunny");
        deleteByName ("Richy");
        System.out.println("My pets deleted");


    }

}



