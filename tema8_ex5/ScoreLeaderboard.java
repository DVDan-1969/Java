package tema8_ex5;
import java.util.TreeSet;
public class ScoreLeaderboard {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(450);
        scores.add(100);
        scores.add(890);
        scores.add(200);

        System.out.println("All scores (sorted): " + scores);

        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());

        scores.removeIf(score -> score < 150);

        System.out.println("Scores after removing <150: " + scores);
    }
}

