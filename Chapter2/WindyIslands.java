package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;
import models.NamedDragon;

// Magelllan's Expedition - Alestorm

public class WindyIslands {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void localeIntro(Dragon hatchling) {
        System.out.println("\n\tYou step out of the carraige onto a beautiful white sand beach.");
        Fillers.wait(2);
        System.out.println("\n\tBefore you lies a small port city surrounded by wooden fence about ten feet tall...");
        Fillers.wait(2);
        System.out.println("\n\tsome of the wooden poles have humunoid skulls atop them.");
        Fillers.wait(2);
        System.out.println("\n\tThe can see the giant sails of many of the ships within the harbor...");
        Fillers.wait(2);
        System.out.println(
                "\n\tYou quickly noticed that all the sails displayed a small flag, all of different colors and variations...");
        Fillers.wait(2);
        System.out.println("\n\tbut they seemed to all be variations of the same basic design... The Jolly Roger...");
        Fillers.wait(2);
        System.out.println(
                "\n\tAs you got closer to the front gate of the port city, you begin to hear a variety of sounds...");
        Fillers.wait(2);
        System.out.println(
                "\n\tsinging, laughing, and the very distinct sound of wine and rum bottles being clinked together.");
        Fillers.wait(2);
        System.out.println(
                "\n\tOn top of the wall, there is a young Goblin looking  nat you with a friendly yet surprisingly toothy smile...");
        Fillers.wait(2);
        System.out.println(
                "\n\t'Welcome to the free city of El Ciclo de Fuego, capital of the United Federation of The Piracy Nation or U-F-P-N for short!!'");
        Fillers.wait(2);
 
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");

          if (hatchling.getSpecies().equals("Shara Ishvalda")) {
            uFPNLeader(hatchling);
        }

        else if (hatchling.getSpecies().equals("Namielle")) {
            anglersLeader(hatchling);
        }
    }

    public static void uFPNLeader(Dragon hatchling) {
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("Have you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("Enter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println("'One last thing, take this.' She hands you a watch. 'Keep it on, I will contact you with the next instructions to save you the trip back over here.'");
                Fillers.wait(2);
                System.out.println("'Now go see that tailor, I will be in contact.'");
                Fillers.wait(2);

        System.out.println("Press ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);
    }

    public static void anglersLeader(Dragon hatchling) {
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("");
        Fillers.wait(2);
        System.out.println("'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("Have you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("Enter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println("'One last thing, take this.' She hands you a watch. 'Keep it on, I will contact you with the next instructions to save you the trip back over here.'");
                Fillers.wait(2);
                System.out.println("'Now go see that tailor, I will be in contact.'");
                Fillers.wait(2);

        System.out.println("Press ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);
    }
}
