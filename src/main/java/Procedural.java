/** Hello! This is the project of a simple game Rock-Scissors-Paper.
 *  The main point of creating this game is consolidation of knowledge Java Core
 * (basic syntax, loops, condition operators, arrays, methods and recursion)
 */
import java.util.Random;
import java.util.Scanner;

public class Procedural {
    public static void main(String[] args) {
        intro();
        game();
        playAgain();}

    static void intro(){{

        // INFO BLOCK
        System.out.println("\n* Hello! Lets play the 'Rock, Scissors, Paper' game.");
        System.out.println("* You will need to type a number, 1, 2 or 3. Where 1 means 'Rock', 2 means 'Scissors' and" +
                " 3 means 'Paper'.");
        System.out.println("* Then computer will make it's move and we'll see if there's somebody win or if it's a tie.");
    }
    }

    static void game(){

        //SCANNER AND RANDOM DECLARATION
        Scanner gameScan = new Scanner(System.in);
        Random rand = new Random();

        // PLAYER's MOVE
        System.out.println("\nType a number, 1, 2 or 3:");
        int playersMove = gameScan.nextInt();
        if (playersMove == 1){
            System.out.println("You move with 'Rock'"); }
        else if(playersMove == 2){
            System.out.println("You move with 'Scissors'"); }
        else if(playersMove == 3){
            System.out.println("You move with 'Paper'"); }
        else {
            System.err.print("Error! You must type only 1, 2 or 3 numbers!");
            System.exit(0);}

        // COMPUTER MOVE
        int compMove = (rand.nextInt(3) + 1);
        System.out.print("\nComputer moves with ");
        switch (compMove){
            case 1:
                System.out.println("'Rock'");
                break;
            case 2:
                System.out.println("'Scissors'");
                break;
            case 3:
                System.out.println("'Paper'");
                break;
        }

        // ROUND RESULTS
        // 1. WIN
        if ((playersMove==1 && compMove==2)||(playersMove==2 && compMove==3)||(playersMove==3 && compMove==1)){
            winArrayPrint();
            System.out.println("\nYou win!"); }
        // 2. LOSE
        if ((playersMove==1 && compMove==3)||(playersMove==2 && compMove==1)||(playersMove==3 && compMove==2)){
            lostArrayPrint();
            System.out.println("\nYou lost!"); }
        // 3. TIE
        if (playersMove==compMove){
            tieArrayPrint();
            System.out.println("\nIt's a tie!"); }
    }

    static void playAgain(){

        Scanner yesNoScan = new Scanner(System.in);
        System.out.println("\nDo you want to play again? (Type 'yes' or 'no')");
        String yesOrNo = yesNoScan.nextLine();
        if (yesOrNo.equals("yes")){
            game();
            playAgain();
        }else if (yesOrNo.equals("no")){
            System.out.println("\nGoodbye! ;)");
            return;
        }
        else{
            System.err.println("Wrong!");
            playAgain();
        }


    }

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

    static void tieArrayPrint(){

        System.out.println();
        final String[][] tieArray = {{"        * *   "},
                {"      *     * "},
                {"           *  "},
                {"          *   "},
                {"              "},
                {"          0   "}};
        for (String[] str1: tieArray){
            for (String str2: str1){
                System.out.println(str2);
            }

        }}}