
/** Hello! This is the project of a simple game Rock-Scissors-Paper.
 *  Created using Java SE, designed by SOLID principles.
 *  Made by Yaroslav Nochnyk.
 *  https://github.com/y-nochnyk
 */

public class Main {
    public static void main(String[] args) throws RockScissorsPaperException {

        //Declaration of the 'Game', 'Human' and 'Computer' classes instances
        Game game = new Game();
        Human human = new Human();
        Computer computer = new Computer();

        game.printHelloMessage();

        //The game cycle
        do { human.move(game);
            game.printMove(human);
            computer.move(game);
            game.printMove(computer);
            game.checkWinner(human, computer);
        }while (game.wannaPlayAgain(human));
    }
}
