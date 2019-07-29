package Trefilova.dto;

public class Items {
    public String getKind() {
        return kind;
    }

    public String getSinger() {
        return singer;
    }

    public String getEtag() {
        return etag;
    }

    public Id getId() {
        return id;
    }

    public String kind;
    public String singer;
    public String etag;
    public Id id;

    @Override
    public String toString() {
        return  "\n" +
                "       kind='" + kind + "\n" +
                "       singer='" + singer + "\n" +
                "       etag='" + etag + "\n" +
                "       id=" + id + "\n" +
                '}';
    }

}
