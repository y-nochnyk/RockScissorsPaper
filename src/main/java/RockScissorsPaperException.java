
import java.io.IOException;

//Class created especially for this app, the exception occurs if there's wrong input number got from the player
//Extends its parent class IOException
public class RockScissorsPaperException extends IOException {

    public RockScissorsPaperException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
