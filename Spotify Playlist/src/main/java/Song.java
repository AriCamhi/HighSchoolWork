/**
 * Class to used to create songs
 * The songs individually will have
 * a title, artist, album, length, genre, and 
 * number of times played
 *
 * @author Ari Camhi, Lucas Duran, Christian Macchetto
 * @version 1-13-22
 */
public class Song{
    // Fields
    private String title;
    private String artist;
    private String album;
    private int length;
    private String genre;
    private int timesPlayed;
    
    /**
     * Empty Constructor
     */
    public Song(){
    
    }
    
    /**
     * Overloaded constructor to create a new 
     * object of a song with all fields filled
     */
    public Song(String title, String artist, String album,
            int length, String genre, int timesPlayed){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.length = length;
        this.genre = genre;
        this.timesPlayed = timesPlayed;
    }
    
    //Setter for the playSong method in SpotifyPlaylist
    public void setTimesPlayed(int newTimesPlayed){
        timesPlayed = newTimesPlayed;
    }    
    
    //Getters to access inside of the toString for Playlist
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public int getTimesPlayed(){
        return timesPlayed;
    }
    
    public int getLength(){
        return length;
    }
    
    //toString for the method printAllSongs()
    /**
     * Big method to help with the toString, much more simplified
     * and helps with organization
     * 
     * @return a fancy string for the toString
     */
    public String toString(){
        String helper = super.toString();
        helper += "  <--- Where the song is in memory..."; 
        helper += " Information of the song in format of title, arist, album, length, genre, timesPlayed: ";
        helper += "\n";
        helper += title + ", " + artist + ", " + album + ", " + genre + ", " + length + ", " + 
        timesPlayed + "\n" + "\n";
        
        return helper;
    }
}