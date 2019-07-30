package REST_testing.Kutsenko.PetStore.PetControllers;

import REST_testing.Kutsenko.PetStore.Utils.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static REST_testing.Kutsenko.PetStore.Utils.DB.*;

public class DBController {

    public static void selectPetsFromBase() {

        String SQL_SELECT = "SELECT * FROM public.pet";
        ResultSet resultSet = null;

        try (Connection conn = DriverManager.getConnection(dbUrl + dbName, dbUser, dbPass);) {
            Statement statement = conn.createStatement();
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

    public static void addPetToBase(String name, String type, String gender, Boolean status) {

        String SQL_INSERT_Pet = "INSERT into public.pet (name, type, gender, status) " +
                "values('" + name + "', '" + type + "', '" + gender + "', " + status + ")";

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
             Statement statement = conn.createStatement()) {
            statement.executeQuery(SQL_INSERT_Pet);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(name + " added!\n");

    }

    public static Integer selectPetByNameFromBase(String name) {
        String SQL_SELECT = "SELECT * FROM public.pet WHERE name = '" + name + "'";
        ResultSet resultSet = null;
        Integer petId = null;

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");) {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(SQL_SELECT);
            System.out.println("Pet selected by name " + name + ":");
            while (resultSet.next()) {
                petId = resultSet.getInt("id");
                System.out.println(
                        resultSet.getInt("id")
                                + " " + resultSet.getString("name")
                                + " " + resultSet.getString("type")
                                + " " + resultSet.getString("gender")
                                + " " + resultSet.getBoolean("status")
                                + "\n"
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return petId;

    }

    public static void updatePetById(Integer id, String name, String type, String gender, Boolean status) {
        String SQL_UPDATE = "UPDATE public.pet SET name = '" + name + "', type = '" + type + "', gender = '" + gender + "', status = " + status + " WHERE id = '" + id + "'";

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");) {
            Statement statement = conn.createStatement();
            statement.executeQuery(SQL_UPDATE);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void updatePetNameById(Integer id, String name) {
        String SQL_UPDATE = "UPDATE public.pet SET name = '" + name + "' WHERE id = " + id;

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");) {
            Statement statement = conn.createStatement();
            statement.executeQuery(SQL_UPDATE);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Name " + name+ " updated by id = " + id + "!\n");

    }

    public static void deletePetByNameFromBase(String name) {
        String SQL_DELETE = "DELETE FROM public.pet WHERE name = '" + name + "'";

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");) {
            Statement statement = conn.createStatement();
            statement.executeQuery(SQL_DELETE);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n" + name + " deleted!");

    }

    public static void deletePetByIdFromBase(Integer id) {
        String SQL_DELETE = "DELETE FROM public.pet WHERE id = " + id;

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");) {
            Statement statement = conn.createStatement();
            statement.executeQuery(SQL_DELETE);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n" + id + " deleted!");

    }

}
