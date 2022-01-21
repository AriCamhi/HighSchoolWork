import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;
/**
 * Showcase the behavior of the Spotify Playlist
 * 
 * @author Java 20-21
 * @version 5-26-21
 */
public class SpotifyPlaylistTester
{
    public static final String SPACER = "\n---------------------------------------------------------------------------------\n";

    public static SpotifyPlaylist playlist;


    @Test
    public void testFoo() {
        playlist.top10();

    }

    @Test
    public void testRemove(){
        int currentSongs = playlist.getNumSongs();

        playlist.removeSong("Father and Son");
        int afterDeletion = playlist.getNumSongs();
        assert(currentSongs - afterDeletion == 1);
    }
    
    /**
     * Create a a playlist with 20 Songs from the Awesome Mix playlist
     * 
     * @return  an Awesome playlist
     */
    @BeforeAll
    public static void createAwesomeMix() {
        Random rng = new Random();
        SpotifyPlaylist awesomeMix = new SpotifyPlaylist();
        
        awesomeMix.addSong( new Song(   "Mr. Blue Sky", 
                                        "ELO",
                                        "Out of the Blue",
                                        303,
                                        "Progressive Pop",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Father and Son", 
                                        "Yusuf / Cat Stevens",
                                        "Tea for the Tillerman",
                                        221,
                                        "Folk Rock",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Come a Little Bit Closer", 
                                        "Jay and the Americans",
                                        "Come a Little Bit Closer",
                                        169,
                                        "Rock",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "The Chain", 
                                        "Fleetwood Mac",
                                        "Rumours",
                                        4 * 60 + 28,
                                        "Post-Grunge",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Bring It On Home to Me", 
                                        "Sam Cooke",
                                        "The Best of Sam Cooke",
                                        2 * 60 + 37,
                                        "R&B",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Don't Stop Me Now", 
                                        "Queen",
                                        "Don't Stop Me Now",
                                        3 * 60 + 29,
                                        "Pop Rock",
                                        rng.nextInt(300)));                                
        
        awesomeMix.addSong( new Song(   "Southern Nights", 
                                        "Glen Campbell",
                                        "Southern Nights",
                                        3 * 60,
                                        "Country Pop",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Brandy (You're a Fine Girl)", 
                                        "Looking Glass",
                                        "Looking Glass",
                                        2 * 60 + 55,
                                        "Soft Rock",
                                        rng.nextInt(300)));
        
        awesomeMix.addSong( new Song(   "Bohemian Rhapsody", 
                                        "Queen",
                                        "A Night at the Opera",
                                        5 * 60 + 55,
                                        "Progressive Pop",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Wham Bam", 
                                        "Silver",
                                        "Silver",
                                        3 * 60 + 25,
                                        "Pop Rock",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Surrender", 
                                        "Cheap Trick",
                                        "Heaven Tonight",
                                        4 * 60 + 12,
                                        "Power Pop",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "My Sweet Lord", 
                                        "George Harrison",
                                        "All Things Must Pass",
                                        4 * 60 + 39,
                                        "Folk Rock",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "The Rubberband Man", 
                                        "The Spinners",
                                        "Happiness is Being with the Spinners",
                                        3 * 60 + 33,
                                        "Soul",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "I Want You Back", 
                                        "The Jackson 5",
                                        "Dianna Ross Presents The Jackson 5",
                                        2 * 60 + 59,
                                        "Motown",
                                        rng.nextInt(300)));
                                        
        awesomeMix.addSong( new Song(   "Hooked on a Feeling", 
                                        "BJ Thomas",
                                        "On My Way",
                                        2 * 60 + 48,
                                        "Pop",
                                        rng.nextInt(300)));
                
        awesomeMix.addSong( new Song(   "Fooled Around and Fell in Love", 
                                        "Elvin Bishop",
                                        "Struttin' My Stuff",
                                        4 * 60 + 35,
                                        "Southern Rock",
                                        rng.nextInt(300)));
                                        
        playlist = awesomeMix;
    }
}