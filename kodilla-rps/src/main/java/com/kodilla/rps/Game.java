package com.kodilla.rps;

import java.util.Random;

public class Game {

    private Player player;
    private static int playerPoints;
    private static int compPoints;
    private static int lengthOfTheGame;
    private boolean gameOver = false;
    private String[] rps = {"Rock", "Paper", "Scissor"};
    public Game(Player player,int lengthOfTheGame) {
        this.player = player;
        this.lengthOfTheGame = lengthOfTheGame;
    }

    public void showMenu() {
        System.out.println("\nHi!");
        System.out.println("Make a choise");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("x. Exit");
        System.out.println("n. Start New Game");
    }

    public void showGameOverMenu() {
        System.out.println("\nHey, game is over! Make a choise what would you like to do now: ");
        System.out.println("x. Exit");
        System.out.println("n. Start New Game");
    }

    public void action(int i) {
        Random randomChoise = new Random();
        int rand = (randomChoise.nextInt(3))  ;

        System.out.println("\nChoise of player " + player.getName() + ": " + rps[i]);
        System.out.println("Choise of computer: " + rps[rand]);

        if(i == rand) {
            System.out.println("Equal result. No points.");
        }
        if(i == 0 && rand ==2 ) {
            playerPoints++;
            System.out.println("\nPoint for player " + player.getName());
        }
        if(i == 0 && rand ==1 ) {
            compPoints++;
            System.out.println("\nPoint for computer ");
        }
        if(i == 1 && rand ==0 ) {
            playerPoints++;
            System.out.println("\nPoint for player " + player.getName());
        }
        if(i == 1 && rand ==2 ) {
            compPoints++;
            System.out.println("\nPoint for computer");
        }
        if(i == 2 && rand ==1 ) {
            playerPoints++;
            System.out.println("\nPoint for player " + player.getName());
        }
        if(i == 2 && rand ==0 ) {
            compPoints++;
            System.out.println("\nPoint for computer");
        }

        System.out.println("Currently result: " + player.getName() + " " + getPlayerPoints() + ":" + getCompPoints() + " Computer");
        System.out.println("Number of point to win: " + getLengthOfTheGame());

        if (compPoints == getLengthOfTheGame()) {
            System.out.println("\nGave over! Computer win");
            gameOver = true;
        }

        if (playerPoints == getLengthOfTheGame()) {
            System.out.println("\nCongratulation " + player.getName() + ", you won!");
            gameOver = true;
        }

    }

    public Player getPlayer() {
        return player;
    }

    public static int getPlayerPoints() {
        return playerPoints;
    }

    public static int getCompPoints() {
        return compPoints;
    }

    public static int getLengthOfTheGame() {
        return lengthOfTheGame;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
