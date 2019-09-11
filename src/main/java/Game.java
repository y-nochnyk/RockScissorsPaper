
import java.util.Scanner;

public class Game {

    //Static final variables for 'Rock', 'Scissors' and 'Paper' player's moves
    static final int ROCK = 1;
    static final int SCISSORS = 2;
    static final int PAPER = 3;

    //Method which prints the 'hello' message, also displays the rules of the game
    void printHelloMessage(){
        System.out.println("\n* Hello! Lets play the 'Rock, Scissors, Paper' game.");
        System.out.println("* You will need to type a number, 1, 2 or 3. Where 1 means 'Rock', 2 means 'Scissors' and" +
                " 3 means 'Paper'.");
        System.out.println("* Then the computer will make its move and we'll see if somebody won or if it's a tie.");
    }

    //Method which prints a message with the instructions for player to set a number between 1 and 3
    void playerSetNumber(){
        System.out.println("\nType a number, 1, 2 or 3:");
    }

    //Method which shows the message previous to the computer random number print
    void computerRandomNumber(){
        System.out.print("\nComputer moves with...");
    }

    //Method which converts player's input number into 'Rock', 'Scissors' or 'Paper' and displays it
    void printMove(Player player){
        if (player instanceof Human){
            System.out.print("You move with ");
            switch (player.getPlayerInput()){
                case ROCK:
                    System.out.println("'Rock'");
                    break;
                case SCISSORS:
                    System.out.println("'Scissors'");
                    break;
                case PAPER:
                    System.out.println("'Paper'");
                    break;
            }
        }else if (player instanceof Computer){
            switch (player.getPlayerInput()){
                case ROCK:
                    System.out.print(" 'Rock'");
                    break;
                case SCISSORS:
                    System.out.print(" 'Scissors'");
                    break;
                case PAPER:
                    System.out.print(" 'Paper'");
                    break;
            }
        }
    }

    //Method which checks if there's somebody won, lost, or it's a tie
    void checkWinner(Player player1, Player player2){
        int a = player1.getPlayerInput();
        int b = player2.getPlayerInput();
        if ((a == ROCK && b == SCISSORS) || (a == SCISSORS && b == PAPER) || (a == PAPER && b == ROCK)) {
            winArrayPrint();
            System.out.println("\nYou win!");
        }if ((a == ROCK && b == PAPER) || (a == SCISSORS && b == ROCK) || (a == PAPER && b == SCISSORS)){
            lostArrayPrint();
            System.out.println("\nYou lost!");
        }if (a == b){
            tieArrayPrint();
            System.out.println("\nIt's a tie!");
        }
    }

    //Method which checks if player wants to play again, takes input number from the console
    boolean wannaPlayAgain(Human human) {
        Scanner playAgainScanner = new Scanner(System.in);
        System.out.println("\nWanna play again? ('y' or 'n')");
        String playAgainString = playAgainScanner.nextLine();
        switch (playAgainString){
            case "y":
                return true;
            case "n":
                System.out.println("\nSee you next time! ;)");
                System.exit(0);
                break;
            default:
                System.out.println("\nOnly 'y' or 'n' symbols are allowed!");
                wannaPlayAgain(human);
                break;
        }return false;
    }


    //The block of the methods which print specific array of the characters according to the result of the game
    static void winArrayPrint(){

        System.out.println();
        final String[][] winArray = {{"         *    "},
                                     {"           *  "},
                                     {"      0     * "},
                                     {"      0     * "},
                                     {"           *  "},
                                     {"         *    "}};
        System.out.println();
        for (String[] str1: winArray){
            for (String str2: str1){
                System.out.println(str2);
            }
        }
    }

    static void lostArrayPrint(){

        System.out.println();
        final String[][] loseArray = {{"            * "},
                                      {"          *   "},
                                      {"      0  *    "},
                                      {"      0  *    "},
                                      {"          *   "},
                                      {"            * "}};
        for (String[] str1: loseArray){
            for (String str2: str1){
                System.out.println(str2);
            }
        }
    }

    static void tieArrayPrint() {

        System.out.println();
        final String[][] tieArray = {{"        * *   "},
                                     {"      *     * "},
                                     {"           *  "},
                                     {"          *   "},
                                     {"              "},
                                     {"          0   "}};
        for (String[] str1 : tieArray) {
            for (String str2 : str1) {
                System.out.println(str2);
            }
        }
    }}
