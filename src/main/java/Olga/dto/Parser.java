package Olga.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Parser {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper  = new ObjectMapper();
        FileStructure file = mapper.readValue(new File("resources/YouTube.json"), FileStructure.class);

        //total result
        totalResults(file);
        System.out.println("------------------------------------------------------------------------------------");

        //singers names
        printSingers(file);
        System.out.println("------------------------------------------------------------------------------------");

        //list singers and songs
        printSingSong(file);
        System.out.println("------------------------------------------------------------------------------------");

        //videoID for song
        printVideoId(file, "Bad Guy");
        System.out.println("------------------------------------------------------------------------------------");


    }

    public static void totalResults(FileStructure file){
        int result = file.pageInfo.totalResults;
        System.out.println("Number of coincidences = " + result);
    }

    public static void printSingers(FileStructure file)
    {
        System.out.println("Singer list:");
        for (Item tmp : file.items)
        {
            System.out.println(tmp.singer);
        }

    }

    public static void printSingSong(FileStructure file)
    {
        for (Item tmp : file.items)
        {
            System.out.println("Singer: " + tmp.singer + ", song: " + tmp.id.song);
        }

    }

    public static void printVideoId(FileStructure file, String song)
    {
        for (Item tmp : file.items)
        {
            if (tmp.id.song.contains(song))
            System.out.println("VideoID for song is " + tmp.id.videoId);
        }

    }

}
