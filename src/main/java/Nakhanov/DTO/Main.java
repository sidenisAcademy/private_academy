package Nakhanov.DTO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static Nakhanov.DTO.Helper.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        MainJson mainJson = objectMapper.readValue(new File("C:\\Users\\vitalii.nakhanov" +
                "\\IdeaProjects\\privat_academy\\src\\main\\resources\\YouTube.json"), MainJson.class);

        List<Items> items = mainJson.items;
        System.out.println(items);
        System.out.println(totalResults(mainJson));
        returnSinger(items);
        returnSingerAndSong(mainJson);
        System.out.println(returnBadGuyId(mainJson));


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddzHH:mm:ss.SSSS");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        compareTime(mainJson.pageInfo);

    }
}

