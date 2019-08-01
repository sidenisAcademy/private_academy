package Isabekov.YouTubeParsing;

public class PageInfo {

    int totalResults;
    int resultsPerPage;
    String data;

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "totalResults=" + totalResults +
                ", resultsPerPage=" + resultsPerPage +
                ", data='" + data + '\'' +
                '}';
    }

}




