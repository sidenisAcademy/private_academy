package Isabekov.Day12;

import java.sql.*;

import static Isabekov.Constants.*;

public class SqlExecution {
    public static void update(String test2) {
        try (Connection conn3 = DriverManager.getConnection("jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
             Statement statement1 = conn3.createStatement()) {
            statement1.executeUpdate(test2);
        } catch (SQLException e) {
            e.getStackTrace();
        }
        System.out.println("your pet has been" + test2);
    }

    public static void Checking(String test3) throws SQLException {


        Connection conn4 = DriverManager.getConnection(dbUrl, dbUser, dbPassword); // до property всё было в виде строк "" явно
        //       String SQL_SELECT = "SELECT * FROM public.pet";
        Statement statement = conn4.createStatement();
        ResultSet resultSet = statement.executeQuery(test3);   //возвращает из таблицы
        while (resultSet.next()) {
            System.out.printf("%s %b %s %s ",
                    resultSet.getString("NAME"),
                    resultSet.getString("status"),
                    resultSet.getString("type"),
                    resultSet.getString("gender")
                            + "\n");
        }
        conn4.close();
    }
}
