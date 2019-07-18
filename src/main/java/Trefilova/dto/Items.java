package Trefilova.dto;

public class Items {
    public String kind;

    @Override
    public String toString() {
        return  "\n" +
                "       kind='" + kind + "\n" +
                "       singer='" + singer + "\n" +
                "       etag='" + etag + "\n" +
                "       id=" + id + "\n" +
                '}';
    }

    public String singer;
    public String etag;
    public Id id;
}
