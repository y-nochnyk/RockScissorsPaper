
import java.util.Scanner;

//Class 'Human' specifying the human behavior, the child of the abstract class 'Player'
public class Human extends Player {

    //Method which gets an input number from a player, overrides the parent's move() method
    @Override
    public int move(Game game) throws RockScissorsPaperException {
        Scanner gameScan = new Scanner(System.in);
        game.playerSetNumber();
        playerInput = gameScan.nextInt();
        if (playerInput < 0 || playerInput > 3)
            throw new RockScissorsPaperException("Only numbers in range of 1-3 are allowed!");
        return playerInput;
    }
}