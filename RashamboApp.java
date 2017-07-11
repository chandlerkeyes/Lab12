import java.util.Scanner;

public class RashamboApp {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name,jOrS,rps,yOrN;

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println();
        System.out.println("Enter your name:");
        name = keyboard.nextLine();
        do {
            System.out.println("Would you like to play against TheJets or TheSharks (J/S)?:");
            jOrS = keyboard.nextLine();
            jOrS = jOrSValid(jOrS);
            System.out.println("Rock, Paper, or Scissors?:");
            rps = keyboard.nextLine();
            rps = rpsValid(rps);
            winOrLose(rps, jOrS, name);
            System.out.println("Would you like to go again? (Y/N)");
            yOrN = keyboard.nextLine();
            yOrN = yOrNValid(yOrN);
        } while (yOrN.equalsIgnoreCase("y"));
        System.out.println("Bye!");

    }
    public static void winOrLose(String rps, String jOrS, String name) {
        Roshambo result;
        TheJets player2 = new TheJets();
        result = player2.getRPS();
        if (jOrS.equalsIgnoreCase("j")) {
            switch (result) {
                case ROCK:
                    if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("YOU WIN");
                    }
                    else if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("YOU LOSE");
                    }
                    else if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.ROCK);
                        System.out.println("You both scared the same");
                    }
                    break;
                case PAPER:
                    if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("YOU LOSE");
                    }
                    else if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("YOU WIN");
                    }
                    else if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.PAPER);
                        System.out.println("You both scared the same");
                    }
                    break;
                case SCISSORS:
                    if (rps.equalsIgnoreCase("paper")) {
                        System.out.println(name + ": PAPER");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("YOU LOSE");
                    }
                    else if (rps.equalsIgnoreCase("rock")) {
                        System.out.println(name + ": ROCK");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("YOU WIN");
                    }
                    else if (rps.equalsIgnoreCase("scissors")) {
                        System.out.println(name + ": SCISSORS");
                        System.out.println("The Jets: " + Roshambo.SCISSORS);
                        System.out.println("You both scored the same");
                    }
                    break;
                    default:
                        System.out.println();
                        break;
            }
        }
        if (jOrS.equalsIgnoreCase("s")) {
            TheSharks player3 = new TheSharks();
            result = player3.getRPS();
            switch (result) {
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
                    break;
            }
        }
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
    public static String yOrNValid(String yOrN) {
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }
    public static String rpsValid(String rps) {
        while (!rps.equalsIgnoreCase("rock") && !rps.equalsIgnoreCase("paper") && !rps.equalsIgnoreCase("scissors")) {
            System.out.println("Invalid Input. Please enter rock, paper, or scissors ");
            rps = keyboard.nextLine();
        }
        return rps;
    }
    public static String jOrSValid(String jOrS) {

        while (!jOrS.equalsIgnoreCase("j") && !jOrS.equalsIgnoreCase("s")) {
            System.out.println("Invalid Input. J or S: ");
            jOrS = keyboard.nextLine();
        }
        return jOrS;
    }

}
