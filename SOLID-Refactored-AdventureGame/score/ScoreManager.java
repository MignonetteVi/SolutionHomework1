package score;

public class ScoreManager {
    private static int score = 0;

    public static void updateScore(int experience) {
        score = experience;
    }

    public static int getScore() {
        return score;
    }
}