package Kutsenko.TestYoutube;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@Getter
@NoArgsConstructor
public class Youtube {

    public String category;
    public String etag;
    public String nextPageToken;
    public String regionCode;
    public PageInfo pageInfo;
    public List<Items> items;

}
