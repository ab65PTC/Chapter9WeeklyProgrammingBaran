public class Recording {
    private String title;
    private String artist;
    private int playingTime; // playing time in seconds
    
    // constructor
    public Recording(String title, String artist, int playingTime) {
        this.title = title;
        this.artist = artist;
        this.playingTime = playingTime;
    }
    
    // getters and setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public int getPlayingTime() {
        return playingTime;
    }
    
    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
}
