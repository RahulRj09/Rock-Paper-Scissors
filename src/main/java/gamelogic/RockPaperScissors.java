package gamelogic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static List<String> computerData = Arrays.asList("rock", "paper", "scissors");

    static String getGameResult(String userInput, String computerInput) {
        if (userInput.equals(computerInput)) {
            System.out.println("draw");
        } else if (userInput.equals("scissors") && computerInput.equals("paper")) {
            System.out.println("you win");
        } else if (userInput.equals("paper") && computerInput.equals("rock")) {
            System.out.println("you win");
        } else if (userInput.equals("rock") && computerInput.equals("scissors")) {
            System.out.println("you win");
        } else {
            System.out.println("sorry you lost");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("you want play again Enter yes");
        String demo = input.nextLine().toLowerCase();
        if (demo.equals("yes")) {
            playAgain();
        }
        return "game over";
    }

    static void playAgain() {
        String userInput = getUserInput();
        getGameResult(userInput, getComputerInput(computerData));

    }

    static String getComputerInput(List<String> computerData) {
        Random random = new Random();
        return computerData.get(random.nextInt(computerData.size()));
    }

    static String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("choose one from 'rock' , 'paper' , 'scissors' ");
        String userInput = input.nextLine().toLowerCase();
        return userInput;
    }

    public static void main(String[] args) {
        String userInput = getUserInput();
        if (computerData.contains(userInput)) {
            System.out.println(getGameResult(userInput, getComputerInput(computerData)));
        } else {
            System.out.println("invalid input");
        }
    }
}
