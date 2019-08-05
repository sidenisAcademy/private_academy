package Gaisenok.dto;

import java.util.Map;

public class Items {
    public String kind;
    public String singer;
    public String etag;
    public id id;

    @Override
    public String toString() {
        return "Items{" +
                "kind='" + kind + '\'' +
                ", singer='" + singer + '\'' +
                ", etag='" + etag + '\'' +
                ", id=" + id +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public id getId() {
        return id;
    }

    public void setId(id id) {
        this.id = id;
    }

}
