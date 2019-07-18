package Isabekov.Model;

import java.util.List;

public class DTO1 {

    public String category;
    public String etag;
    public String nextPageToken;
    public String regionCode;
    public PageInfo pageInfo;
    public List<Items> items;

    @Override
    public String toString() {
        return "DTO1{" +
                "category='" + category + '\'' +
                ", etag='" + etag + '\'' +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }



//    @Override
//    public String toString() {
//        return "Models.DTO1{" +
//                "category='" + category + '\'' +
//                ", etag='" + etag + '\'' +
//                ", nextPageToken='" + nextPageToken + '\'' +
//                ", regionCode='" + regionCode + '\'' +
//                ", pageInfo=" + pageInfo +
//                ", items=" + items +
//                '}';
//    }
}
