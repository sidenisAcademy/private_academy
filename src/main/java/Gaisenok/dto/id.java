package Gaisenok.dto;

public class id {
    public String song;
    public String videoId;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
    @Override
    public String toString() {
        return "id{" +
                "song='" + song + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}
