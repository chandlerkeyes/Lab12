/**
 * Created by chand on 7/10/2017.
 */
public class TheSharks extends Player{
    @Override
    public Roshambo getRPS() {
        return Roshambo.ROCK;
    }

    @Override
    public Roshambo getRPSInput(String userInput) {
        return null;
    }
    
}
