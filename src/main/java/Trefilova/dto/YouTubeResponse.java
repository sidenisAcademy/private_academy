package Trefilova.dto;

import java.util.List;

public class YouTubeResponse {
   public String category;
   public String etag;
   public String nextPageToken;
   public String regionCode;
   public PageInfo pageInfo;
   public List<Items> items;

   @Override
   public String toString() {
       return "YouTubeResponse{" + "\n" +
               "    category='" + category + "\n" +
               "    etag=" + etag + "\n" +
               "    nextPageToken" + nextPageToken + "\n" +
               "    regionCode" + regionCode + "\n" +
               "    pageInfo" + pageInfo + "\n" +
               "    items" + items + "\n" +
               '}';
   }
}
