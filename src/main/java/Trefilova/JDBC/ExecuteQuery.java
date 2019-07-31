package Trefilova.JDBC;

import java.sql.*;

import static Trefilova.JDBC.PropertiesList.dbName;
import static Trefilova.JDBC.PropertiesList.dbPassword;
import static Trefilova.JDBC.PropertiesList.dbUrl;

public class ExecuteQuery {

    public static void selectPets(String q) {
        try(Connection conn = DriverManager.getConnection(dbUrl + dbName, dbName, dbPassword);
            Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                System.out.println (String.format("%d %s %s %s %b",
                        resultSet.getInt("Id"),
                        resultSet.getString("name"),
                        resultSet.getString("type"),
                        resultSet.getString("gender"),
                        resultSet.getBoolean("status")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void other(String s) {
        try(Connection conn = DriverManager.getConnection(dbUrl + dbName, dbName, dbPassword);
            Statement statement = conn.createStatement()) {
            statement.executeUpdate(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

