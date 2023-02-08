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
        System.out.println("\n\tThe city now lies in front of you on the other side of a long bridge. ");
        Fillers.wait(2);
        System.out.println("\n\tAfter crossign the bridge, you are face an arched gatehouse with a wrought Iron fence.");
        Fillers.wait(2);
        System.out.println(
                "\n\tOn the other side of the iron fence, you can see a figure with a staff and a latern standing about 1 meter tall.");
   
        // Introduction to Berdi "a friendly face." 
        // Berdi will take the reader to the tribes of either DeepWater Gnomes or Cave Goblins
        Fillers.wait(2);
        System.out.println("\n\tAs you appraoch you can see the figure is a gnome, her face and hair are partially hidden underneath a hood.");
        Fillers.wait(2);
        System.out.println("\n\tUpon seeing your dragon she gestures to the gatehouse to let you in, as the doors open you get a much better look at her.");
        Fillers.wait(2);
        System.out.println("\n\tHer skin is pale with dark wide spaced eyes, her nose is small save for a bulbous end that seems almost unnaturally red.");
        Fillers.wait(2);
        System.out.println("\n\t'Hello friend' she calls out, her voice nearly as high pitched as a child's.");
        Fillers.wait(2);
        System.out.println("\n\t'My name is Berdi, I see you have recently aquired a new friend' she gestures towards your dragon.");
        Fillers.wait(2);
        System.out.println("\n\t'Ya'know " + hatchling.getSpecies() + " are quite rare, you are in the only legitimate place for your training.'");
        Fillers.wait(2);
        System.out.println("\n\tAs you follow her into the city, Berdi lowers her hood revealing perfectly interwoven braids on either side of her head.");
        Fillers.wait(2);
        System.out.println("\n\t'I'm guessing by your confused look you don't actually know where you are?'");
        Fillers.wait(2);
        System.out.println("\n\t'In that case and in the case that it's my job, let me welcome you to DeepHolm, the city by the lake.'");
        Fillers.wait(2);
        System.out.println("\n\tshe grabs your hand and leads you furthe rand further into the city...");
        Fillers.wait(2);
        System.out.println("\n\t'I can take you to someone that can set you up to get started on you journey...");
        Fillers.wait(1);
        System.out.println("\n\tPress ENTER to continue...");
        scan.nextLine();

        // After pressing ENTER the encounter with the tribe leader is initiated..


        System.out.println("\n\tBerdi leads you deeper into the city within the cave, down roads paved with stone all neatly layed and worm smoooth.");
        Fillers.wait(2);
        System.out.println("\n\tOne road leads to another and yet another, until you arrive at a large cathedral-esque structure in the heart of the city.");
        Fillers.wait(2);
        System.out.println("\n\tYou both enter through giant colored glass doors that opens up into a enormous dinning hall.");
        Fillers.wait(2);
        System.out.println("\n\tAfter a few more doors, the two of you arrive in a small room carved driectly from the stone, ceiling high pillars line the walls.");
        Fillers.wait(2);
        System.out.println("\n\tIn the opposite side is a large roaring fireplace, in front of the flame is a small outline of a gnome standing, staring into the distance.");
        Fillers.wait(2);
        System.out.println("\n\tHe doesn't hear the two of you enter immediately until you get close enough to get a good look at him.");
        Fillers.wait(2);
        System.out.println("\n\tHis head is the same pale color as Berdi's but is totally void of hair. Instead it is lined with horizontal wrinkles and vertical charcoal colored tattoos.");
        Fillers.wait(2);
        System.out.println("\n\tAs he turns around you can see the tattoos stop at a thick heavy brow. His small white eyes flicker and squint in your direction.");
        Fillers.wait(2);
        System.out.println("\n\t'Well Hello, so nice to see a new face' his voice surprisingly deep for his not even a full meter stature.");
        Fillers.wait(2);
        System.out.println("\n\t'Name's Dhommos, current presiding president of the DeepHolm Gnomes Tribe. There is only one reason a human would travel this far.'");
        Fillers.wait(2);
        System.out.println("\n\t'So I'm guessing you've acquired a hatchling and need our guidance...' He laughs and smiles");
        Fillers.wait(2);
        System.out.println("\n\t'Well if you're going to join us you will need to look like one of us, clearly someone of your vertical proporations has only one option...'");
        Fillers.wait(2);
        System.out.println("\n\tYou're gonna have to wear our armor, you're gonna need it when you start learning to ride anyway.'");
        Fillers.wait(2);
        System.out.println("\n\t'Since Gnome sizes only get so big, the tailor will have to make it for you, his shop is back the way you came.'");
        Fillers.wait(2);
        System.out.println("\n\t'He happens to be an old friend, we have an arrangement so you don't need to worry about payment at the moment, just tell him I sent ya.'");
        Fillers.wait(2);
        System.out.println("\n\t'The Dragon should be a dead giveaway though, Berdi will lead you there...'");
        Fillers.wait(2);
        System.out.println("\n\t'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("\n\tHave you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("\n\tEnter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println(
                "\n\t'One last thing, take this.' He hands you a watch. 'Keep it on, I will contact you with the next instructions to save you the trip back over here.'");
        Fillers.wait(2);
        System.out.println("\n\t'Now go see that tailor, I will be in contact.'");
        Fillers.wait(2);

        System.out.println("\n\tPress ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);
    }

}
