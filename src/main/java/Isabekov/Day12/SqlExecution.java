package Isabekov.Day12;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.sql.*;

import static Isabekov.Constants.*;

public class SqlExecution {

    public static void deletePetByName(String name) {
        String request = "DELETE FROM public.pet where name = '%s'";
        request = String.format(request, name);
        changeData(request);
        System.out.println("your pet has been " + request);
    }

    public static void createPet(String name, boolean status, String type, String gender) {
        String request = "INSERT INTO public.pet(NAME, STATUS, type, gender) values('%s', %b, '%s', '%s')";
        request = String.format(request, name, status, type, gender);
        changeData(request);
        System.out.println("your pet has been " + request);
    }
    private static void changeData(String test2) {
        try (Connection conn3 = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement statement1 = conn3.createStatement()) {
            statement1.executeUpdate(test2);
        } catch (SQLException e) {
            e.getStackTrace();
        }

    }

    public static void CheckMyPet(String name) {
        String request = "SELECT * FROM public.pet where name = '" + name + "'";
        Checking(request);
  //      System.out.println("your pet has been " + request);
    }

    private static void Checking(String test3)  {
        try (Connection conn4 = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            //       String SQL_SELECT = "SELECT * FROM public.pet";
            Statement statement = conn4.createStatement();
            //      String test3 = "SELECT * FROM public.pet";
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
        } catch (Exception e) {
            e.getStackTrace();// до property всё было в виде строк "" явно
        }
    }
}
