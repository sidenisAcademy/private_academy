package Gaisenok.dto;

public class PageInfo {
    @Override
    public String toString() {
        return "PageInfo{" +
                "totalResults=" + totalResults +
                ", resultsPerPage=" + resultsPerPage +
                ", data='" + data + '\'' +
                '}';
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    int totalResults;
    int resultsPerPage;
    String data;
}
