
import java.util.Random;

//Class 'Computer' specifying the AI behavior, the child of the abstract class 'Player'
public class Computer extends Player {

    //Method which gets an input random number from the computer, overrides the parent's move() method
    @Override
    public int move(Game game) {
        Random rand = new Random();
        game.computerRandomNumber();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        playerInput = (rand.nextInt(3) + 1);
        return playerInput;
    }
}