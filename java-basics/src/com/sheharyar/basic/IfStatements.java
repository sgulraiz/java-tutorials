package com.sheharyar.basic;

public class IfStatements {

    public static void main(String[] args){
        boolean gameOver = false;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);

        if (gameOver) {
            if (score <= 5000 && score > 3000) {
                System.out.println("You are on the first rank - Your final score is " + finalScore);
            } else if (score <= 3000 && score > 1000) {
                System.out.println("You are on the second rank - Your final score is " + finalScore);
            } else
            {
                System.out.println("Your rank is too low - Your final score is " + finalScore);
            }
        } else {
            System.out.println("Game is not over!!!");
        }
    }
}
