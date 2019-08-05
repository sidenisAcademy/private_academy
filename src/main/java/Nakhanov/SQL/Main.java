package Nakhanov.SQL;

import Nakhanov.SQL.JDBC.JdbcDriver;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

     public static void main(String[] args) throws Exception {
        String selectQuery = "select * from public.pet";
        String insertQuery = "INSERT INTO PUBLIC.PET(name, type, gender, status) " +
                "VALUES ('Andrey','hamster','ololo',false)";

        String deleteQuery = "DELETE from PUBLIC.PET";

        String updateString = "UPDATE public.pet SET     ";

        String str = RandomStringUtils.randomAlphabetic(10);
        System.out.println(str);
        JdbcDriver jdbcDriver = new JdbcDriver();

        //jdbcDriver.insertQuery(insertQuery);

        jdbcDriver.selectQuery(selectQuery + " where id = 777");
//        jdbcDriver.deleteQuery(deleteQuery);
//        jdbcDriver.updateQuery(updateString + "name='Ololosh' where name='Andrey'");
//        jdbcDriver.insertRandomNameQuery();
        jdbcDriver.selectQuery(selectQuery);
        jdbcDriver.selectTypeQuery();









    }
}
