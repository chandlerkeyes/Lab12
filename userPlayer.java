import java.util.Random;

/**
 * Created by chand on 7/10/2017.
 */
public class userPlayer extends Player {

    @Override
    public Roshambo getRPS() {
        Random RANDOM = new Random();
        return VALUES[RANDOM.nextInt(LENGTH)];
    }

    @Override
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
