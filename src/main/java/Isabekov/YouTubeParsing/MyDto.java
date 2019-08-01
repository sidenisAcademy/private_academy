package Isabekov.YouTubeParsing;

import java.util.List;

public class MyDto {

    public String category;
    public String etag;
    public String nextPageToken;
    public String regionCode;
    public PageInfo pageInfo;
    public List<Items> items;

    @Override
    public String toString() {
        return "Models.DTO1{" +
                "category='" + category + '\'' +
                ", etag='" + etag + '\'' +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }
}