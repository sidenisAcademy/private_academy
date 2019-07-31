package Isabekov.Day12;

import java.sql.*;

import static Isabekov.Day12.SqlExecution.*;


public class ConnectToSQL {
    public static void main(String[] args) throws SQLException {
//        Connection conn = DriverManager.getConnection( "jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
//завернуть в try - tech - finally для открытия и закрытия сессии

        deletePetByName("Bim");
//  old version      update("INSERT INTO public.pet(NAME, STATUS, type, gender) values('Bim', true, 'dog', 'M')");
        createPet("Sim",true, "cat","M");
        CheckMyPet("Sim");


        //        SQL commands

//        String SQL_DELETE = "DELETE * FROM public.pet (NAME, STATUS, type, gender) values('Bim', true, 'dog', 'M')";
//        Statement statement2 = conn.createStatement();
//        statement2.executeQuery(SQL_DELETE);
//        conn.close();

//        String SQL_DELETE = "DELETE * FROM public.pet";
//        Statement statement2 = conn.createStatement();
//        statement2.executeQuery(SQL_DELETE);
//        while (resultSet.next()) {
//        conn.close();

//    private void select(){
//        Connection conn2 = DriverManager.getConnection( "jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
//            String SQL_SELECT = "SELECT * FROM public.pet";
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery(SQL_SELECT);   //возвращает из таблицы
//            while (resultSet.next()) {
//                System.out.printf("%s %b %s %s ",
//                        resultSet.getString("NAME"),
//                        resultSet.getString("status"),
//                        resultSet.getString("type"),
//                        resultSet.getString("gender")
//                                + "\n");
//            }
//            conn2.close();


//        Connection conn1 = DriverManager.getConnection( "jdbc:postgresql://172.16.12.15:5432/postgres", "postgres", "123qwe");
//        String SQL_INSERT = "INSERT INTO public.pet(NAME, STATUS, type, gender) values('Bim', true, 'dog', 'M')";
// //       String SQL_INSERT2 = "INSERT INTO public.pet(NAME, STATUS, type, gender) values('Murzik', true, cat, M)";
//        Statement statement1 = conn1.createStatement();
//        statement1.executeQuery(SQL_INSERT);
//        conn.close();

    }



}
