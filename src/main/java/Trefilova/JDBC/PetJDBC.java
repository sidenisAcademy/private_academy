package Trefilova.JDBC;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Properties;

import static Trefilova.JDBC.ExecuteQuery.other;
import static Trefilova.JDBC.ExecuteQuery.selectPets;
import static Trefilova.JDBC.PropertiesList.dbUser;
import static Trefilova.JDBC.Property.createProperty;
import static Trefilova.JDBC.Property.getPropertyValue;
import static Trefilova.JDBC.Property.readProperty;
import static Trefilova.JDBC.Queries.*;

public class PetJDBC {
    public static void main(String[] args) {
        //selectPets(selectAll(5));
        selectPets(selectAll());
        //other(insertValues(666, "Pushok", "Beast", "male", false));
        //other(insertValues(5, "Petr", "Parrot", "male", true));
        //selectPets(selectAll("Petr"));
        //other(deleteValues("Petr"));
        //other(updateName(5));
        //selectPets(selectAll(5));

        //createProperty();
        //readProperty();
        //System.out.println(getPropertyValue("db.user"));

        //System.out.println("User name = " + dbUser);

    }
}
