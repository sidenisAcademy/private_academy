package Isabekov.YouTubeParsing;

public class Id {
    public String song;
    public String videoId;

    public void setSong(String song) {
        this.song = song;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getSong() {
        return song;
    }

    public String getVideoId() {
        return videoId;
    }

    @Override
    public String toString() {
        return "Id{" +
                "song='" + song + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }


}
