package tema8_ex6;
import java.util.LinkedHashSet;

public class MusicPlaylist {
    public static void main(String[] args) {

        LinkedHashSet<String> playlist = new LinkedHashSet<>();

        playlist.add("Eye of the Tiger");
        playlist.add("Lose Yourself");
        playlist.add("Stronger");
        playlist.add("Can't Hold Us");

        boolean added = playlist.add("Lose Yourself");
        System.out.println("Attempt to add duplicate song: " + (added ? "Added" : "Not Added"));

        System.out.println("Playlist order:");
        for (String song : playlist) {
            System.out.println(song);
        }

        playlist.clear();
        System.out.println("Playlist after clearing: " + playlist);
    }
}
