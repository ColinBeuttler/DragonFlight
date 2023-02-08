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
                "\n\tOn top of the wall, there is a young Goblin looking diretcly at you with a friendly yet surprisingly toothy smile...");
        Fillers.wait(2);
        System.out.println(
                "\n\t'Welcome to the free city of El Ciclo de Fuego, capital of the United Federation of The Piracy Nation or U-F-P-N for short!!'");
        Fillers.wait(2);
 
        Fillers.wait(2);
        System.out.println("\n\tAs he lowers himself off the wall with a tail covered in wispy white hair, you notice he is carrying a samll curved sword.");
        Fillers.wait(2);
        System.out.println("\n\tHe falls the last few meters landing on all fours. He strightens up revealing ragged clothes including a numerously mended vest and baker's boy cap.");
        Fillers.wait(2);
        System.out.println("\n\tHis face was wide with red eyes spread appart by a wide flat nose. Small pointed teeth lined the top and bottom of a smile that extended ear to ear.");
        Fillers.wait(2);
        System.out.println("\n\tThe white wispy hair that was on his tail covered most of the rest of him except his face and the bottom edge and tips of his long jagged ears.");
        Fillers.wait(2);
        System.out.println("\n\t'Hello there', the goblin extends his paw.");
        Fillers.wait(2);
        System.out.println("\n\t'Name's Ollie, I'm the resident greeter here, what brings you to this corner of the world?'");
        Fillers.wait(2);
        System.out.println("\n\tBefore you can answer, the newly hatched dragon makes an appearance from within your jacket.");
        Fillers.wait(2);
        System.out.println("\n\t'Oi!! Haven't seen one of those in some time. I can take you where you need to go, follow me.'");
        Fillers.wait(2);
        System.out.println("\n\tOllie leads you through the gates into the giant port city, as you pass over a cobblestone bridge upward you get a good look at the peculiar place.");
        Fillers.wait(2);
        System.out.println("\n\tThe docks to the right of you, are filled with ships both giant and small of every variety imaginable. Their crews are comprised of every species you've heard about, and some you haven't.");
        Fillers.wait(2);
        System.out.println("\n\tThe sound of offkey singing you heard before entering the city, becomes clearer as you look left and see a composite struture of inns, vender stalls, and fishing shops.");
        Fillers.wait(2);
        System.out.println("\n\tThe inns are full of sailors, drinking, laughing, singing, gambling. Ollie notices your distraction upon taking in the scene and gestures you to continue following.");
        Fillers.wait(2);
        System.out.println("\n\tThe two of you head down an alleyway, then a smaller path between storehouses, the sounds from the inn are growing fainter.");
        Fillers.wait(2);
        System.out.println("\n\t'We are almost there now.' Ollie turns back lookign at you.");
        Fillers.wait(2);
        System.out.println("\n\tAfter climbing a wooden staircase you are looking out on a wooden plank canopy hanging above the city. Sitting on top of the canopy are small lodgings.");
        Fillers.wait(2);
        System.out.println("\n\tEvery building has a tarp streched between it and the next adjecent, the canopy is both shady and calm because of this unlike the busy port below.");
        Fillers.wait(2);
        System.out.println("\n\t'Here we are.' Ollie stops in front of one of the apartments.");
        Fillers.wait(1);
        System.out.println("\n\tPress ENTER to continue...");
        scan.nextLine();
         
        // After pressing ENTER the encounter with the tribe leader is initiated..

        System.out.println("\n\tDespite the outward appearence, the interior is quite well kempt.");
        Fillers.wait(2);
        System.out.println("\n\tA tidy bed on one side, bookshelves and cooking supplies on the other, the walls are covered in harpoons and fishing supplies.");
        Fillers.wait(2);
        System.out.println("\n\tA small cast iron stove is in the center with a wooden table the wraps around nearly the entirety of it.");
        Fillers.wait(2);
        System.out.println("\n\tBehind a large wooden desk, a tall creature sits reading, he looks up as you enter. ");
        Fillers.wait(2);
        System.out.println("\n\tHis face is long and gaunt, his features lay flat against his face, his skin is a light green color on his face with a reddish hue around the gills lining his neck.");
        Fillers.wait(2);
        System.out.println("\n\tRows of tentacle-like appendages lined th etop his his head, every single one appeared to be pulled back tight against his skull.");
        Fillers.wait(2);
        System.out.println("\n\t'Hello, sorry I wasn't expecting anyone, my name is Jhimas. I am the Elder of the Anglers dragon tribe.' ");
        Fillers.wait(2);
        System.out.println("\n\t'I can see from the dragon, that you came here for riding training. I hope you are ready for the journey this road involves.'");
        Fillers.wait(2);
        System.out.println("\n\t'Anyway, first things first, you will need a suit that can withstand lightning strikes and torrential rains. Liek the one I have on.'");
        Fillers.wait(2);
        System.out.println("\n\tYou notice he is wearing a suit that appears to made of a rubbery skin of a dolphin, parts of the outer matieral seem woven and other bits are baggy and ruffled.");
        Fillers.wait(2);
        System.out.println("\n\t'I have a good relationship with the tailor in this city, he will need to get your measurements. Ollie, do you mind leading the way?'");
        Fillers.wait(2);
        System.out.println("\n\tOllie nods in agreement with Jhimas.");
        Fillers.wait(2);
        System.out.println("\n\t'Payment shouldn't be an issue, however materials for such a suit are rare, so he may ask you to gather them for him.'");
        Fillers.wait(2);
        System.out.println("\n\t'I have one question for you though...");
        Fillers.wait(2);
        System.out.println("\n\tHave you named your dragon yet?'");
        Fillers.wait(2);
        System.out.println("\n\tEnter a name for your dragon.");

        // pick the dragons name, this will later become the new namedDragon object
        String dragonName = scan.nextLine();
        NamedDragon dragon = NamedDragon.creatNamedDragon(hatchling, dragonName);

        System.out.println("\n\t'One last thing, take this.' He hands you a watch. 'Keep it on, I will contact you with this to save you the trip back.'");
                Fillers.wait(2);
                System.out.println("\n\t'Now go see that tailor, I will be in contact.'");
                Fillers.wait(2);

        System.out.println("\n\tPress ENTER to continue....");
        scan.nextLine();

        // initiate the diaglogue wiht the tailor in order to get your flightsuit
        TheTailor.tailorDialogue(dragon);
    }
}
