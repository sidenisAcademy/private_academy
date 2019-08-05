package Kutsenko.TestWordPress;

import java.util.ArrayList;
import java.util.Arrays;

public class WordPress {

    public Integer id;
    public Boolean status;
    public String[] meta;
    public String date;
    public String date_gmt;
    public Guid guid;
    public Integer[] categories;
    public Integer[] tags;

    @Override
    public String toString() {
        return "WordPress{" +
                "id=" + id +
                ", status=" + status +
                ", meta=" + Arrays.toString(meta) +
                ", date='" + date + '\'' +
                ", date_gmt='" + date_gmt + '\'' +
                ", guid=" + guid +
                ", categories=" + Arrays.toString(categories) +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
