package Nakhanov.SQL.JDBC;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;

import static Nakhanov.Constant.*;

public class JdbcDriver {



    public void selectQuery(String selectQuery) {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.printf("%s %s %s %s %s " + "\n",
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("type"),
                        resultSet.getString("gender"),
                        resultSet.getBoolean("status"));
            }
        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }
    }

    public void insertQuery(String insertQuery) {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(insertQuery);

        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }
    }

    public void deleteQuery(String deleteQuery) {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }
    }

    public void updateQuery(String updateQuery) {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            statement.executeUpdate(updateQuery);

        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }

    }

    public void insertRandomNameQuery() {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            statement.executeUpdate("INSERT INTO PUBLIC.PET(name, type, gender, status) " +
                    "VALUES ('" + RandomStringUtils.randomAlphabetic(10) + "','hamster','ololo',false)");

        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }
    }

    public void selectTypeQuery() {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl + dbName,
                             dbUserName, dbPassword);
             Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select type from public.pet");
            while (resultSet.next()) {

                System.out.printf("%s" + "\n",
                        resultSet.getString("type"));
            }
        } catch (SQLException e) {
            System.out.println("Alarm " + e.getMessage());
        }
    }

}

