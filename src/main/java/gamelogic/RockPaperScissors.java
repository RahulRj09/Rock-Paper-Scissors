package gamelogic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static List<String> computerData = Arrays.asList("rock", "paper", "scissors");
    static Scanner input = new Scanner(System.in);

    static String getGameResult(String userInput, String computerInput) {
        if (userInput.equals(computerInput)) {
            return "draw";
        } else if (userInput.equals("scissors") && computerInput.equals("paper")) {
            return "you win";
        } else if (userInput.equals("paper") && computerInput.equals("rock")) {
            return "you win";
        } else if (userInput.equals("rock") && computerInput.equals("scissors")) {
            return "you win";
        }
        return "sorry you lost";

    }

    static String getComputerInput(List<String> computerData) {
        Random random = new Random();
        return computerData.get(random.nextInt(computerData.size()));
    }

    static String getUserInput() {
        System.out.println("choose one from 'rock' , 'paper' , 'scissors' ");
        String userInput = input.nextLine().toLowerCase();
        return userInput;
    }

    public static void main(String[] args) {
        while (true) {
            String userInput = getUserInput();
            if (computerData.contains(userInput)) {
                System.out.println(getGameResult(userInput, getComputerInput(computerData)));
            } else {
                System.out.println("invalid input");
            }
            System.out.println("you want to play again enter any key ? if you don't want to play again enter 'no' ");
            String playAgain = input.nextLine().toLowerCase();
            if (playAgain.equals("no")) {
                break;
            }
        }
    }
}
