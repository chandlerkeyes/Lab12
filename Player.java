import java.util.Random;

/**
 * Created by chand on 7/10/2017.
 */
public abstract class Player {
    private String name;

    public static final Roshambo[] VALUES = Roshambo.values();
    public static final int LENGTH = VALUES.length;


    public abstract Roshambo getRPS();
}
