package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;
import models.NamedDragon;

// Universe - Edge of Paradise
// Ghosts - Xandria

public class SkyFortress {

    static Scanner scan = new Scanner(System.in);
    
    public static void localeIntro(Dragon hatchling) {
        // intro to location - description of new location
        System.out.println("\n\tYou look out into a giant black horizon...");
        Fillers.wait(2);
        System.out.println(
                "\n\tits seems that you are on the edge of space, you can see the stars more clearly than ever before.");
        Fillers.wait(2);
        System.out.println(
                "\n\tYou then realize that you had stepped on a large metal platform that is moving upward...");
        Fillers.wait(2);
        System.out.println("\n\tsuddenly it stops and in front of you is a giantic metal structure.");
        Fillers.wait(2);
        System.out.println("\n\tThe structure seems to be made of various smaller pieces of sheet metal. ");
        Fillers.wait(2);
        System.out.println("\n\tmost of them painted vibrant colors...");
        Fillers.wait(2);
        System.out.println("\n\tthere are even small pieces of glass, which you assume are makeshift windows.");
        Fillers.wait(2);
        System.out.println(
                "\n\tAs you move closer to this giant metal object, you notice a structure jutting out in the front...");
        Fillers.wait(2);
        System.out.println(
                "\n\tit appears to be a separate piece than the rest of the structure that had been attached later.");
        Fillers.wait(2);
        System.out.println(
                "\n\tThe structure has a small colored glass window on the front with two large bright eyes peering through it...");

        System.out.println("Press ENTER to Continue...");
        scan.nextLine();
   
        // A new character is introduced, this character takes you to the tribe leader
        // In this case Gilly, she will take reader to either cyber children or cyber elves...

        Fillers.wait(2);
        System.out.println("a small section of the large structure moves revealing a doorway.");
        Fillers.wait(2);
        System.out.println(
                "Out of the doorway walks a child, about a meter tall, wearing a large brightly colored yellow coat and very baggy blue capri shorts.");
        Fillers.wait(2);
        System.out.println(
                "She had long dark braided hair and as you got closer you could see that one arm and one of her legs was metal.");
        Fillers.wait(2);
        System.out.println(
                "Her neck has bright pink geomatric tattoos on either side, her eyes blue eyes have a deep sense of knowledge to them beyond the years of a child.");
        Fillers.wait(2);
        System.out.println("She looks directly at you before she opens her mouth...");
        Fillers.wait(2);
        System.out.println(
                "'You must be new here, this is the SkyCity, home of many alien species and dragons from other worlds'");
        Fillers.wait(2);
        System.out.println("'I see you have a " + hatchling.getSpecies()
                + " there... I'm guessing you came here to train it.'");
        Fillers.wait(2);
        System.out.println(
                "'My name is Gilly, I'm one of the cyber children, I can't help you train it, but I know someone who can...'");
        Fillers.wait(2);
        System.out.println(
                "She gestures for you to follow her, as you walk through the doorway you get your first glimpse of the city...");
        Fillers.wait(2);
        System.out.println(
                "On either side of you are large dark walls that are made of large metal boxes of various sizes with metal pilars between them..");
        Fillers.wait(2);
        System.out.println(
                "The ones at ground level have open fronts about three meters wide or more with colorful signs and awnings, each has an assortment of fresh food or clothing and trinkets.");
        Fillers.wait(2);
        System.out.println("The street itself is about ten meters wide and is covered in metal scraps and grates. ");
        Fillers.wait(2);
        System.out.println(
                "People of all shapes and sizes crowd the streets, many of which ressemble Gilly, many much larger.");
        Fillers.wait(2);
        System.out.println(
                "Gilly leads you down a narrow alley way, small doors and windows line either side, somes you can see eyes staring back from within. ");
        Fillers.wait(2);
        System.out.println(
                "You continue to be lead down many passage ways, right then left and right again until you come to a door that is much larger than any of the previous you passed.");
        Fillers.wait(2);
        System.out.println("'Here we are, ready to head inside?'");
        Fillers.wait(1);
        System.out.println("\n\tPress ENTER to continue...");
        scan.nextLine();

        // your dragon type determines which leader you will see in the next scene depneding on the species you picked in the first chapter

        if (hatchling.getSpecies().equals("Gore Magala")) {
            cyberChildLeader(hatchling);
        }

        else if (hatchling.getSpecies().equals("Xeno'jiiva")) {
            cyberElvesLeader(hatchling);
        }

    }
    
    public static void cyberChildLeader(Dragon hatchling) {

        System.out.println("After you walk through the doorway, you find yourself in a small waiting room.");
        Fillers.wait(2);
        System.out.println("The walls are all white and on the wall opposite the entrance is a sliding glass panel with a creature similar to Gilly behind it.");
        Fillers.wait(2);
        System.out.println("Both you and Gilly are guided to a hallway through the only door into the room...");
        Fillers.wait(2);
        System.out.println("the door swings open, a voice commands you to enter, both you and Gilly walk into a stark white office.");
        Fillers.wait(2);
        System.out.println("Most of the room is being taken up by a large cubicle, covered in stickers, models, and pictures of dragons and their riders.");
        Fillers.wait(2);
        System.out.println("'Salutaions newcomer' says a female voice from behind the cubicle, then out walks another child sized creature.");
        Fillers.wait(2);
        System.out.println("She has a similar build and features to Gilly, although has an older and more attentive face.");
        Fillers.wait(2);
        System.out.println("'Friends call me Poppy, I'm the current commander of the Cyber Children dragon tribe.'");
        Fillers.wait(2);
        System.out.println("Poppy has on a bright orange flightsuit with white and blue stripes running down each side and across the front. She notices as you eye the suit.");
        Fillers.wait(2);
        System.out.println("'Like the suit? That's our first order of business, you're gonna have to get your own if you want to ride a dragon...");
        Fillers.wait(2);
        System.out.println(
                "you will need to see the tailor for fitting and such, he will back the way you came in the market, Gilly knows the way.'");
        Fillers.wait(2);
        System.out.println("She motions to Gilly who nods in acknowledgement.");
        Fillers.wait(2);
        System.out.println("'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("Have you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("Enter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println("'One last thing, take this.' She hands you a watch. 'Keep it on, so I can contact you without having to make a trip back here.'");
                Fillers.wait(2);
                System.out.println("'Now go see that tailor, I will be in touch.'");
                Fillers.wait(2);

        System.out.println("Press ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);

    }
    
    public static void cyberElvesLeader(Dragon hatchling) {
        System.out.println("The room before you seems to be a lounge of some kind, the walls are white and totally smooth.");
        Fillers.wait(2);
        System.out.println("There is a bar on one side of the room and a sunken conversation area with red seating all the way around, ");
        Fillers.wait(2);
        System.out.println("soft light is coming from the walls and windows stretching along the wall opposite to you.");
        Fillers.wait(2);
        System.out.println("Gilly leads you through another door and then a hallway and then yet another hallway until you come to what appears to be a manager's back office.");
        Fillers.wait(2);
        System.out.println("You setp inside, to find a small room separated by a large colored glass panel, on one side is a small but very tidy bed,");
        Fillers.wait(2);
        System.out.println("on the other, there is a single glass table with three benches, one on each side except the side adjecnt the only window in the room.");
        Fillers.wait(2);
        System.out.println("The walls are grey and featureless, sitting at the bench agaisnt the glass wall is a tall figure smoking a cigarette.");
        Fillers.wait(2);
        System.out.println("As you enter, the figure turns her head, she has a narrow elven face with pale green skin, a visor covers the top half of her face.");
        Fillers.wait(2);
        System.out.println("Her eyes glowing through the transparent visor, resembling two pink embers, a horn sticking out of the helmet on either side of her head.");
        Fillers.wait(2);
        System.out.println("She grins as you enter, as she does her purple lips grip her cigarette tighter exposing her pointed canines.");
        Fillers.wait(2);
        System.out.println("'Welcome, come please sit down here' her voice travels across the room with a smooth effortlessness.");
        Fillers.wait(2);
        System.out.println("As you walk over and sit down you notice she is wearing a form fitting black flight suit with a cut-off fur linned jacket on top.");
        Fillers.wait(2);
        System.out.println("'I'm Xopa, chief commander of the Xeno Tribe, I like to personally meet new riders to help them take their first steps...'");
        Fillers.wait(2);
        System.out.println("'So first steps... you're gonna need a flight suit like mine, that withstand the intensity of a wormhole...'");
        Fillers.wait(2);
        System.out.println("'There's a tailor back in the market the way you came, he and I have a professional arrangement, he will be able to make what you need.'");
        Fillers.wait(2);
        System.out.println("'Gilly will be able to show you the way.' she smiles at Gilly who salutes nods in agreement.");
        Fillers.wait(2);
        
        System.out.println("'I do have one question for you though...");
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

