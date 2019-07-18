package Trefilova.dto;

public class PageInfo {
    public int totalResults;
    public int resultsPerPage;
    public String data;

    @Override
    public String toString() {
        return  "\n" +
                "       totalResults=" + totalResults + "\n" +
                "       resultsPerPage=" + resultsPerPage + "\n" +
                "       data=" + data;
    }
}
