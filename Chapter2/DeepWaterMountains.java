package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;

// Chambers of Fire - Battlelore
// Heavy Lies the Crown - Draconian

public class DeepWaterMountains {

    static Scanner scan = new Scanner(System.in);

    public static void localeIntro(Dragon hatchling) {
        System.out.println("\n\tBefore you there is a large cavern jutting out of the side a very dark mountain");
        Fillers.wait(2);
        System.out.println("\n\tthe sky is grey with the smell of rain lingering in the air...");
        Fillers.wait(2);
        System.out.println("\n\tmost of the runoff rain you see is being funneled into the cavern before you.");
        Fillers.wait(2);
        System.out.println(
                "\n\tYou head into the cavern deeper and deeeper, the further down you go the slower and more peaceful the runoff becomes.");
        Fillers.wait(2);
        System.out.println("\n\tEventually the cavern opens up into a massive chamber...");
        Fillers.wait(2);
        System.out
                .println("\n\tYou can now see that the runoff was leading to a small lake within this large chamber.");
        Fillers.wait(2);
        System.out.println("\n\tNext to the lake lies a small city, you head down the narrow path towards the city...");
        Fillers.wait(2);
        System.out.println(
                "\n\tsome of the buildings within the city lie directly on the lake while others are carved directly into the stalagmites");
        Fillers.wait(2);
        System.out
                .println("\n\tAs you start to get closer to the city you hear a small crunch underneath your feet...");
        Fillers.wait(2);
        System.out
                .println("\n\tyou look down to see the floor of the chamber around you is littered with small bones.");
        Fillers.wait(2);
        System.out.println(
                "\n\tthe ceiling seems to be made of either fur and scales and occasionly you notice a slight shifting.");
        Fillers.wait(2);
        System.out.println("The city now lies in front of you on the other side of a long bridge. ");
        Fillers.wait(2);
        System.out.println("After crossign the bridge, you are face an arched gatehouse with a wrought Iron fence.");
        Fillers.wait(2);
        System.out.println("On the other side of the iron fence, you can see a figure with a staff and a latern standing about 1 meter tall.");
    }
    
    public static void theFriendlyFace(Dragon hatchling) {
        Fillers.wait(2);
        System.out.println("As you appraoch you can see the figure is a gnome, her face and hair are partially hidden underneath a hood.");
        Fillers.wait(2);
        System.out.println("Upon seeing your dragon she gestures to the gatehouse to let you in, as the doors open you get a much better look at her.");
        Fillers.wait(2);
        System.out.println("Her skin is pale with dark wide spaced eyes, her nose is small save for a bulbous end that seems almost unnaturally red.");
        Fillers.wait(2);
        System.out.println("'Hello friend' she calls out, her voice nearly as high pitched as a child's.");
        Fillers.wait(2);
        System.out.println("'My name is Berdi, I see you have recently aquired a new friend' she gestures towards your dragon.");
        Fillers.wait(2);
        System.out.println("'Ya'know " + hatchling.getSpecies() + " are quite rare, you are in the only legitimate place for your training.'");
        Fillers.wait(2);
        System.out.println("As you follow her into the city, Berdi lowers her hood revealing perfectly interwoven braids on either side of her head.");
        Fillers.wait(2);
        System.out.println("'I'm guessing by your confused look you don't actually know where you are?'");
        Fillers.wait(2);
        System.out.println("'In that case and in the case that it's my job, let me welcome you to DeepHolm, the city by the lake.'");
        Fillers.wait(2);
        System.out.println("she grabs your hand and leads you furthe rand further into the city...");
        Fillers.wait(2);
        System.out.println("'I can take you to someone that can set you up to get started on you journey...");
        Fillers.wait(1);
        System.out.println("\n\tPress ENTER to continue...");
        scan.nextLine();


          if (hatchling.getSpecies().equals("Gogmazios")) {
            deepWaterGnomesLeader();
        }

        else if (hatchling.getSpecies().equals("Malzena")) {
            caveGoblinLeader();
        }
    }

    public static void deepWaterGnomesLeader() {
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
    }

    public static void caveGoblinLeader() {
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
    }
}
