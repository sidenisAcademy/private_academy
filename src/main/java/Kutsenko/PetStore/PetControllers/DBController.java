package Kutsenko.PetStore.PetControllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import static Kutsenko.PetStore.Utils.DB.*;

public class DBController {

    public static void selectPetsFromBase() {
        String SQL_SELECT = "SELECT * FROM public.pet";
        ResultSet resultSet = null;
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
             Statement statement = conn.createStatement()) {
            resultSet = statement.executeQuery(SQL_SELECT);
            System.out.println("List of pets:");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("NAME")
                                + " " +
                                resultSet.getBoolean("status")
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static HashMap<String, String> selectPetByNameFromBase(String name) {
        String SQL_SELECT = "SELECT * FROM public.pet WHERE name = '" + name + "'";
        ResultSet resultSet = null;
        Integer petId = null;
        String petData = null;
        HashMap<String, String> map = new HashMap<>();
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
             Statement statement = conn.createStatement()) {
            resultSet = statement.executeQuery(SQL_SELECT);
            System.out.println("Pet selected by name " + name + ":");
            while (resultSet.next()) {
                petId = resultSet.getInt("id");
                petData = resultSet.getInt("id")
                        + " " + resultSet.getString("name")
                        + " " + resultSet.getString("type")
                        + " " + resultSet.getString("gender")
                        + " " + resultSet.getBoolean("status")
                        + "\n"
                ;
                map.put("id", petId.toString());
                map.put("data", petData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;

    }

    public static void addPetToBase(String name, String type, String gender, Boolean status) {
        String SQL_INSERT_Pet = "INSERT into public.pet (name, type, gender, status) " +
                "values('" + name + "', '" + type + "', '" + gender + "', " + status + ")";
        dbUpdate(SQL_INSERT_Pet);
        System.out.println(name + " added!\n");
    }

    public static void updatePetById(Integer id, String name, String type, String gender, Boolean status) {
        String SQL_UPDATE = "UPDATE public.pet SET name = '" + name + "', type = '" + type + "', gender = '"
                + gender + "', status = " + status + " WHERE id = '" + id + "'";
        dbUpdate(SQL_UPDATE);
    }

    public static void updatePetNameById(Integer id, String name) {
        String SQL_UPDATE = "UPDATE public.pet SET name = '" + name + "' WHERE id = " + id;
        dbUpdate(SQL_UPDATE);
        System.out.println("Name " + name + " updated by id = " + id + "!\n");
    }

    public static void deletePetByNameFromBase(String name) {
        String SQL_DELETE = "DELETE FROM public.pet WHERE name = '" + name + "'";
        dbUpdate(SQL_DELETE);
        System.out.println("\n" + name + " deleted!");
    }

    public static void deletePetByIdFromBase(Integer id) {
        String SQL_DELETE = "DELETE FROM public.pet WHERE id = " + id;
        dbUpdate(SQL_DELETE);
        System.out.println("\n" + id + " deleted!");
    }

    private static void dbUpdate(String SQL_UPDATE) {
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(SQL_UPDATE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
