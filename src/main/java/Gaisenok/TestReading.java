package Gaisenok;

import java.io.IOException;

public class TestReading {
    public static void main(String[] arg) {
        ReadingFile myFile = new ReadingFile();
        try {
            myFile.readFiles("myFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}