package gamelogic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static String getGameResult(String userInput, String computerInput) {
        if (userInput.equals(computerInput)) {
            return "draw";
        } else if(userInput.equals("scissors") && computerInput.equals("paper")){
                return "you win";
        }else if(userInput.equals("paper") && computerInput.equals("rock")){
            return "you win";
        }else if(userInput.equals("rock") && computerInput.equals("scissors")){
            return "you win";
        }
        return "sorry you lost";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose one from 'rock' , 'paper' , 'scissors' ");
        String userInput = input.nextLine().toLowerCase();
        List<String> computerData = Arrays.asList("rock", "paper", "scissors");
        Random random = new Random();
        if (computerData.contains(userInput)) {
            System.out.println(getGameResult(userInput, computerData.get(random.nextInt(computerData.size()))));
        } else {
            System.out.println("invalid input");
        }
    }
}
