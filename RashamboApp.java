import java.util.Scanner;

public class RashamboApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name,jOrS,rps,yOrN;

        System.out.println("Welcome to TheSharks Paper Scissors!");
        System.out.println();
        System.out.println("Enter your name:");
        name = keyboard.nextLine();
        do {
            System.out.println("Would you like to play against TheJets or TheSharks (J/S)?:");
            jOrS = keyboard.nextLine();

            System.out.println("Rock, Paper, or Scissors?:");
            rps = keyboard.nextLine();
            winOrLose(rps, jOrS, name);
            System.out.println("Would you like to go again? (Y/N)");
            yOrN = keyboard.nextLine();
            yOrN = yOrNValid(yOrN);
        } while (yOrN.equalsIgnoreCase("y"));
        System.out.println("Bye!");

    }

    public static Roshambo theJets() {
        Roshambo result;
        TheJets player2 = new TheJets();
        result = player2.getRPS();
        return result;
    }

    public static Roshambo theSharks() {
        Roshambo result;
        TheSharks player3 = new TheSharks();
        result = player3.getRPS();
        return result;
    }

    public static void winOrLose(String rps, String jOrS, String name) {
        if (jOrS.equalsIgnoreCase("j")) {
            Roshambo team = theJets();
            switch (team) {
                case ROCK:
                    if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("YOU WIN");
                    }
                    if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("YOU LOSE");
                    }
                    if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("You both scared the same");
                    }
                case PAPER:
                    if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("YOU LOSE");
                    }
                    if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("YOU WIN");
                    }
                    if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("You both scared the same");
                    }
                case SCISSORS:
                    if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("YOU LOSE");
                    }
                    if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("YOU WIN");
                    }
                    if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("You both scored the same");
                    }
            }
        }

                if (jOrS.equalsIgnoreCase("s")) {
                Roshambo team = theSharks();
                switch (team) {
                    case ROCK:
                        if (rps.equalsIgnoreCase("paper")) {
                            System.out.println(name + ": PAPER");
                            System.out.println("The Sharks: " + Roshambo.ROCK);
                            System.out.println("YOU WIN");
                        }
                        if (rps.equalsIgnoreCase("scissors")) {
                            System.out.println(name + ": SCISSORS");
                            System.out.println("The Sharks: " + Roshambo.ROCK);
                            System.out.println("YOU LOSE");
                        }
                        if (rps.equalsIgnoreCase("rock")) {
                            System.out.println(name + ": ROCK");
                            System.out.println("The Sharks: " + Roshambo.ROCK);
                            System.out.println("You both scared the same");
                        }
                }
            }
        }

    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }
}



