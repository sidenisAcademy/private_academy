package Trefilova.JDBC;

import java.sql.ResultSet;

public class Queries {
    public static String selectAll() {
        String SQL_SELECT = "SELECT * FROM public.pet";
        return SQL_SELECT;
    }

    public static String selectAll(int id) {
        String SQL_SELECT_Pets = "SELECT * FROM public.pet WHERE id =" + id;
        return SQL_SELECT_Pets;
    }

    public static String selectAll(String name) {
        String SQL_SELECT_Pets = "SELECT * FROM public.pet WHERE name ='" + name + "'";
        return SQL_SELECT_Pets;
    }

    public static String insertValues(int id, String name, String type, String gender, boolean status) {
        String SQL_INSERT = "INSERT INTO public.pet (id, name, type, gender, status) values ('"
                            + id + "', '" + name + "', '" + type + "', '" + gender + "', '" + status + "')";
        return SQL_INSERT;
    }

    public static String updateName(int id){
        String SQL_UPDATE = "UPDATE public.pet SET name = 'Kesha' WHERE id = " + id;
        return SQL_UPDATE;
    }

    public static String deleteValues(String name) {
        String SQL_DELETE = "DELETE FROM public.pet WHERE name = '" + name + "'";
        return SQL_DELETE;
    }
}
