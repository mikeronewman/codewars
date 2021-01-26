public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            String[] current = game.split(":");
            int score1 = Integer.parseInt(current[0]);
            int score2 = Integer.parseInt(current[1]);
            if (score1 > score2) {
                totalPoints += 3;
            }
            if (score1 == score2) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}
