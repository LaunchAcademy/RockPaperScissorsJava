import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args){
    //prompt the user for their game selection
    String selection = getUserInput();
    if(selection.equals("rock") || selection.equals("paper") || selection.equals("scissors")) {
      //play the game
      //generate the computer's selection
      Random random = new Random();
      String compPick;
      int randomNum = random.nextInt(3);
      if(randomNum == 0) {
        compPick = "rock";
      }
      else if(randomNum == 1){
        compPick = "paper";
      }
      else {
        compPick = "scissors";
      }
      System.out.println("You chose " + selection);
      System.out.println("Computer chose " + compPick);
      String gameResult = "";
      if(selection.equals(compPick)){
        gameResult = "ITS A TIE!";
      }
      else if(selection.equals("rock")) {
        if (compPick.equals("scissors")) {
          gameResult = "YOU WIN";
        }
        else {
          gameResult = "YOU LOSE";
        }
      }
      else if(selection.equals("paper")){
        if(compPick.equals("rock")){
          gameResult = "YOU WIN";
        }
        else {
          gameResult = "YOU LOSE";
        }
      }
      else if(selection.equals("scissors")){
        if(compPick.equals("paper")){
          gameResult = "YOU WIN";
        }
        else {
          gameResult = "YOU LOSE";
        }
      }
      //tell the user who won!
      System.out.println(gameResult);
    }
    else {
      System.out.println("Please make a valid selection");
    }

  }

  private static String getUserInput() {
    System.out.println("rock, paper, or scissors?");
    Scanner scanner = new Scanner(System.in);
    return scanner.next().toLowerCase();
  }
}