
//Abstract class 'Player' specifying the properties of its child classes
public abstract class Player {

    protected int playerInput;

    public int getPlayerInput() {
        return playerInput;
    }

    abstract int move(Game game) throws RockScissorsPaperException;
}
