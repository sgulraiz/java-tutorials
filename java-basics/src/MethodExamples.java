public class MethodExamples {

    public static void main (String[] args) {

        int score = calculateHighScorePosition(2000);
        System.out.println(score);
    }

//        Method to calculate High Score Position
//        This method take one argument, the player score and returns the integer position

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }




}
