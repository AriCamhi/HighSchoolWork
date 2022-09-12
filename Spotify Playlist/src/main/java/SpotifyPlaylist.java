import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * Class that haves the ability to
 * Add a song, print out all songs,
 * print out all songs in a given genre,
 * print out the top 10 most popular songs,
 * Play a song (increase the # of times played),
 * Remove a song given the title
 *
 * @author Ari Camhi, Lucas Duran, Christian Macchetto
 * @version 1-13-22
 */
public class SpotifyPlaylist {
    private Song[] playlist = new Song[1000];

    //Getter for numSongs... Helps with testing
    public int getNumSongs() {
        return numSongs;
    }

    private int numSongs;

    /**
     * Will add an object (song) to the spotify playlist array
     * but will not return anything, just take up a slot inside
     * the playlist array after making a new song through
     * the song class
     */
    public void addSong(Song song) {
        int i = numSongs;
        playlist[i] = song;
        numSongs++;
    }

    /**
     * Method that will print out all songs with
     * no requirements, just all songs and the details/fields
     * in the songs of the playlist
     * through a toString
     *
     * @return a String with all info of songs inside the playlist
     */
    public String printAllSongs() {
        String output = "";
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                output += playlist[i];
                //Don't need to put .toString() because each object already has that built in
            } else {
                break;
            }
        }
        System.out.println(output);
        //Printing, because the return box is not big enough to see everything
        return output;
        //Also returning though because it is "returning" the string 
    }

    /**
     * Method that will print out all songs only of a given genre,
     * just the title of it, no other details besides the parameter
     * of the given genre
     *
     * @param genreParam genre you want to see with songs in it
     * @return titles of the songs in the given genre
     */
    public String printByGenre(String genreParam) {
        String output = "";
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                if (playlist[i].getGenre().equals(genreParam)) {
                    output += "Title of song " + (i + 1) + ": " + playlist[i].getTitle() + "\n";
                }
            }
        }
        //Header for the print 
        System.out.println("All songs that are " + genreParam + ": " + "\n");
        System.out.println(output);
        return output;
    }

    /**
     * Method that will print the top10 most played songs using
     * bubble sort
     */
    public void top10() {
        int n = numSongs;
        //Outer loop is just going through each of the songs in array
        for (int i = 0; i < n - 1; i++) {
            //Nested loop is doing each pass through
            for (int j = 0; j < n - i - 1; j++) {
                //The if statement is the criteria
                if (playlist[j].getTimesPlayed() < playlist[j + 1].getTimesPlayed()) {
                    //Going to swap j and the j+1 if the 'j' is smaller
                    //Basically sending the smaller one to the right
                    Song temp = playlist[j];
                    playlist[j] = playlist[j + 1];
                    //Setting the j + 1 into temp because it is the one to work with in the next loop
                    playlist[j + 1] = temp;
                }
            }
        }
        //Printing only the first 10 songs, not the whole playlist
        System.out.println("Top 10 Most Played Songs: " + "\n");
        for (int y = 0; y < 10; ++y) {
            System.out.println(playlist[y].getTitle() + ": " + playlist[y].getTimesPlayed() + " plays");
        }
    }

    /**
     * Method to play a song (not actually play music) just add 1 to the
     * times played count
     *
     * @param position the position of the song chosen to play (will be 0 based)
     */
    public void playSong(int position) {
        for (int i = 0; i < playlist.length; i++) {
            if (i == position) {
                int timesPlayed = playlist[i].getTimesPlayed();
                timesPlayed++;
                playlist[i].setTimesPlayed(timesPlayed);
            }
        }
    }

    /**
     * Remove a song given the title, will just replace with null and send
     * the null slot to the very back
     * <p>
     * Thought process: scan for title, once found, set to null... Then move each other object until null to the left
     *
     * @param titleParam the songs title
     */
    public void removeSong(String titleParam) {
        //Outer loop will find the song desired to be removed
        boolean didWork = false;
        for (int i = 0; i < numSongs; i++) {
            //If statement for using the parameter
            if (titleParam.equals(playlist[i].getTitle())) {
                //Moves the rest of the array so there is no null slot in the middle
                for (int j = i; j < playlist.length; j++) {
                    //If the song to the right doesn't equal null, move the current null slot to the right
                    if (playlist[j + 1] != null) {
                        playlist[j] = null;
                        playlist[j] = playlist[j + 1];
                        didWork = true;
                    } else {
                        break;
                    }
                }
            }
        }
        //Subtract 1 from the number of songs
        if (didWork) {
            numSongs--;
        }
    }

    //Advanced... Predicates, mapping, streams, filters, collects
    //Turning my toString method into a more general one that could be used anywhere in printByCriteria()
    public void printByCriteria(Predicate<Song> p) {
        System.out.println(Arrays.stream(playlist).filter(p1 -> p1 != null).filter(y -> p.test(y)).
                map(x -> x.toString()).
                collect(Collectors.joining()));
    }

    public void printByArtist(String artist, int timesPlayed) {
        printByCriteria(p -> p.getArtist().equals(artist) && p.getTimesPlayed() >= timesPlayed);
    }

    public void printByGenreV2(String genreParam) {
        printByCriteria(p -> p.getGenre().equals(genreParam));
    }
}