package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;
import models.NamedDragon;

// Chambers of Fire - Battlelore
// Heavy Lies the Crown - Draconian

public class DeepWaterMountains {

    static Scanner scan = new Scanner(System.in);

    public static void localeIntro(Dragon hatchling) {

        // Description of first glance at Deepholm 
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
        System.out.println(
                "On the other side of the iron fence, you can see a figure with a staff and a latern standing about 1 meter tall.");
   
        // Introduction to Berdi "a friendly face." 
        // Berdi will take the reader to the tribes of either DeepWater Gnomes or Cave Goblins
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
            deepWaterGnomesLeader(hatchling);
        }

        else if (hatchling.getSpecies().equals("Malzena")) {
            caveGoblinLeader(hatchling);
        }
    }

    public static void deepWaterGnomesLeader(Dragon hatchling) {
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

        System.out.println(
                "'One last thing, take this.' He hands you a watch. 'Keep it on, I will contact you with the next instructions to save you the trip back over here.'");
        Fillers.wait(2);
        System.out.println("'Now go see that tailor, I will be in contact.'");
        Fillers.wait(2);

        System.out.println("Press ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);
    }
    


    public static void caveGoblinLeader(Dragon hatchling) {
        System.out.println(
                "Berdi leads you thorugh the city until you come to a large stalagmite with windows carved into its sides.");
        Fillers.wait(2);
        System.out.println(
                "She leads you up the spiral staircase carved into the rock until you arrive at a giant stainglass doorway.");
        Fillers.wait(2);
        System.out.println(
                "The two of you enter the stalagmite into a room with a fireplace and giant stone columns reachign to the ceiling, all the furnitrue is covered in furs.");
        Fillers.wait(2);
        System.out.println(
                "you are led up another staircase within the structure, until you find yourself standing in front of a small stone door.");
        Fillers.wait(2);
        System.out.println(
                "You both walk through the door, you are standing with an office, bookshelves on either side of you, a large rug covering the stoen floor.");
        Fillers.wait(2);
        System.out.println(
                "'Excuse the mess, I was expecting company,' a raspy voice says as a tall pale goblin stands up from behind a large wooden desk.");
        Fillers.wait(2);
        System.out.println(
                "His a dark and widely spaced on a slim, angular face. His ears are long, broad at the base and end in sharp points, resembling those of a bat's.");
        Fillers.wait(2);
        System.out.println(
                "Both of his giant ears are pierced multiple times along the bottom edge, his flat triangular nose had a large gold ring through the center.");
        Fillers.wait(2);
        System.out.println(
                "'My name is Gnax, I'm the elder of the cave Goblin Dragon Tribe. And you have already met Berdi...' He turns to Berdi and smiles.");
        Fillers.wait(2);
        System.out.println(
                "'So let's get started you have a lot of work ahead of you, first you will need to get a riding suit, and I doubt we have a spare suit that would fit a human.'");
        Fillers.wait(2);
        System.out.println(
                "'There is a tailor in DeepHolm within the market district, we have a deal with the tailor there, he makes all our suits, he will be able to help you out.'");
        Fillers.wait(2);
        System.out.println(
                "'Don't worry about paying, we have a business account with him the covers expenses for new recruits. Although he may ask for the materials for your suit.'");
        Fillers.wait(2);
        System.out.println("'Berdi, can you lead our friend back to the market?' Berdi nods.");
        Fillers.wait(2);
        System.out.println("'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("Have you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("Enter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println(
                "'One last thing, take this.' He hands you a watch. 'Keep it on, I will contact you with the next instructions to save you the trip back up here.'");
        Fillers.wait(2);
        System.out.println("'Now go see that tailor, I will be in contact.'");
        Fillers.wait(2);
        System.out.println("Press ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);

    }

}
