package com.kodilla.rps;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        RpsRunner.game();
    }

    public static void game() {
        System.out.println("Hey! Let's play the game");
        System.out.println("What is your name?: ");
        boolean end = false;
        Scanner input = new Scanner(System.in);

        Player player1 = new Player(input.next());
        System.out.println("How many wins to end the game?");
        int howMuch = input.nextInt();

        Game game = new Game(player1, howMuch);

        while (!end) {
            game.showMenu();
            String choise = input.next();

            switch (choise) {
                case "1":
                    game.action(0);
                    break;
                case "2":
                    game.action(1);
                    break;
                case "3":
                    game.action(2);
                    break;
                case "x":
                    System.exit(0);
                case "n":
                    RpsRunner.game();
                default:
                    System.out.println("Bad choise. make it again");
            }
            end = game.isGameOver();
        }
        while (true) {
            game.showGameOverMenu();
            String choise2 = input.next();
            switch (choise2) {
                case "x":
                    System.exit(0);
                case "n":
                    RpsRunner.game();
                default:
                    System.out.println("Bad choise. Make it again");
            }
        }
    }
}
