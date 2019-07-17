package Kutsenko.TestErrors;
import java.io.*;

public class TestOpenFile {

    static void openWithTryCatch(String filePath) {
        FileReader input = null;
        try{
            input = new FileReader(filePath);
            BufferedReader br = new BufferedReader(input);
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try{
                input.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    static void openWithTryCatch2(String filePath) {
        //InputStream input = null;
        try(FileReader input = new FileReader(filePath)){

            BufferedReader br = new BufferedReader(input);
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    static void openWithThrow(String filePath) throws IOException {
        FileReader input = new FileReader(filePath);
        BufferedReader br = new BufferedReader(input);
        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
    }


    public static void main(String[] args) {
       System.out.println("With try-catch:");
       openWithTryCatch("resources/test.txt");
       System.out.println("With try-catch 2:");
       openWithTryCatch2("resources/test.txt");
       try {
           System.out.println("With throws:");
           openWithThrow("resources/test.txt");
       } catch (IOException e) {
           System.out.println(e);
       }
    }
}
