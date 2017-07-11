import java.util.Random;

/**
 * Created by chand on 7/10/2017.
 */
public abstract class Player {
    private String name;

    public static final Roshambo[] VALUES = Roshambo.values();
    public static final int LENGTH = VALUES.length;


    public abstract Roshambo getRPS();

    public Roshambo getRPSInput(String userInput) {
        Roshambo result = Roshambo.SCISSORS;
        if(userInput.equalsIgnoreCase("scissor")){
            result = Roshambo.SCISSORS;;
        }
        else if(userInput.equalsIgnoreCase("rock")){
            result = Roshambo.ROCK;;
        }
        else if(userInput.equalsIgnoreCase("paper")){
            result = Roshambo.PAPER;;
        }
        return result;
    }
}
