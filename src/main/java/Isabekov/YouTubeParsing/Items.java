package Isabekov.YouTubeParsing;

public class Items {
    public String kind;
    public String singer;
    public String etag;
    public Id id;

    @Override
    public String toString() {
        return "Items{" +
                "kind='" + kind + '\'' +
                ", singer='" + singer + '\'' +
                ", etag='" + etag + '\'' +
                ", id=" + id +
                '}';
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setId(Id id) {
        this.id = id;
    }

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
}
