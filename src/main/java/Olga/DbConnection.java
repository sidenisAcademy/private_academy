package Olga;

import java.sql.*;

import static Olga.Property.*;

public class DbConnection {

    public static void selectQuery(String parameter) {
        try (Connection connection =
                     DriverManager.getConnection("jdbc:postgresql://" + dbUrl + "/" + dbName, dbUserName, dbPassword)) {

            Statement statement = connection.createStatement();

            String request = "SELECT %s from public.pet";
            request = String.format(request, parameter);
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                System.out.printf("%s  %s ",
                                  resultSet.getString("name"),
                                  resultSet.getBoolean("status") + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectByName(String parameter, String condition) {
        String request = "SELECT %s from public.pet where name in (%s)";
        request = String.format(request, parameter, condition);

        dbSelect(parameter, request);
    }

    public static void selectById(String parameter, String condition) {
        String request = "SELECT %s from public.pet where id in (%s)";
        request = String.format(request, parameter, condition);

        dbSelect(parameter, request);
    }

    private static void dbSelect(String columnName, String request) {
        try (Connection connection =
                     DriverManager.getConnection("jdbc:postgresql://" + dbUrl + "/" + dbName, dbUserName, dbPassword)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                System.out.printf("%s ",
                                  resultSet.getString(columnName) + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void changeName(String oldName, String newName) {
        String request = "UPDATE public.pet set name  = '%s' where name  = '%s'";
        request = String.format(request, newName, oldName);
        otherQuery(request);
    }

    public static void deleteByName(String name) {
        String request = "DELETE from public.pet where name like '" + name + "%'";
        otherQuery(request);
    }

    public static void dbInsert(String name, String type, String gender, boolean status) {
        String request = "INSERT into public.pet (name, type, gender, status) values ('%s', '%s', '%s', %b)";
        request = String.format(request, name, type, gender, status);
        otherQuery(request);
    }

    private static void otherQuery(String query) {
        try (Connection connection =
                     DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
