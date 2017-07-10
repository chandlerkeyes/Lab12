import java.util.Random;

/**
 * Created by chand on 7/10/2017.
 */
public class TheJets extends Player {
    @Override
    public Roshambo getRPS() {
        {
            Random RANDOM = new Random();
            return VALUES[RANDOM.nextInt(LENGTH)];
        }
    }

    @Override
    public Roshambo getRPSInput(String userInput) {
        return null;
    }
}
