package Polozov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.sql.*;
import java.util.List;

public class Temp2Test {
    public static void main(String[] args) throws Exception {
        try {
            Connection connection =
                    DriverManager.
                            getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
            System.out.println("Java JDBC PostgreSQL Example");
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();

            String SQL_SELECT = "SELECT * FROM public.pet";
            Array test = null;
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.pet");
            while (resultSet.next()) {
                System.out.printf("%s  %s  %s",
                        resultSet.getString("NAME"),
                        resultSet.getString("status"),
                        resultSet.getString("photo_url")
                                + "\n");
                System.out.println(String.format("%s  %s ",
                        resultSet.getString("NAME"),
                        resultSet.getString("status")));
                test = resultSet.getArray("photo_url");
                String[] z = (String[]) test.getArray();
                for (String b : z) {
                    System.out.println(b);
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
