package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;
import models.Materials;

public class TheTailor {

    static Scanner scan = new Scanner(System.in);
    
    public static void tailorDialogue(Dragon dragon) {
            System.out.println("\n\tUpon entering the tailor's shop, you see a tall slender figure before you...");
            Fillers.wait(2);
            System.out.println("\n\tThe figure appears to be human except that this figure is entirely made of metal.");
            Fillers.wait(2);
            System.out.println(
                            "\n\tHis face is smooth and mostly featureless, save for two large glowing eyes and a small rectangular mouth.");
            Fillers.wait(2);
            System.out.println(
                            "\n\tDespit his unusually tall and slender proportions, he is wearing a vest perfectly fitted to his body, every single pocket is filled with sewing needles.");
            Fillers.wait(2);
            System.out.println(
                            "\n\tThe shirt underneath is as clean as you have ever seen with the sleeves rolled up.");
            Fillers.wait(2);
            System.out.println("\n\tAs he notices you walk in, his eyes became softer and more human...");
            Fillers.wait(2);
            System.out.println("\n\t'Hello there, I'm the tailor, what can I do for you?'");
            Fillers.wait(2);
            System.out.println("\n\tAs he speaks, (dragon.getname) makes an appearence from your pocket.");
            Fillers.wait(2);
            System.out.println("\n\t'Ah a dragon rider I see, I assume your hear for a flight suit then?'");
            System.out.println("\n\tY/N?");
            String res = scan.nextLine();

            if (!(res.equalsIgnoreCase("y"))) {
                    System.out
                                    .println("\n\t'I don't actually make anything else, and I've already been paid on your behalf...'");
                    Fillers.wait(2);
                    System.out.println("\n\t'So where were we?'");
            }

            Fillers.wait(2);
            System.out.println("\n\t'Looks like your dragon is a " + dragon.getSpecies() + ".'");
            Fillers.wait(2);
            System.out.println("\n\t'With that particular little guy, you will need a special suit...'");
            Fillers.wait(2);

            if (dragon.getSpecies().equals("Xeno")) {
                    System.out.println(
                                    "\n\t'a suit that can withstand the harshness of space and withstand the punishment of wormholes.'");
            } else if (dragon.getSpecies().equals("Nami")) {
                    System.out.println(
                                    "\n\t'a suit that can shrug off lightning strikes and torrential downpours.'");
            } else if (dragon.getSpecies().equals("Goggy")) {
                    System.out.println(
                                    "\n\t'a suit that can fucntion in low light and withstand the shockwave of smashing solid rock.'");
            }
            System.out.println(
                            "\n\t'So quite straightforward really. I do need one thing from you though... the raw materials.'");
            Fillers.wait(2);

            System.out.println("He hands you a piece of paper with a list of the materials written on it.");
            Fillers.wait(2);
            System.out.println(
                            "'You should be able to find everything you need in this very market, it may be a little difficcult to know which shops though.'");
            Fillers.wait(2);
            System.out.println("");
            Fillers.wait(2);
            System.out.println("");
            Fillers.wait(2);
            System.out.println("");
            Fillers.wait(2);

            Materials materialList;

        if (dragon.getSpecies().equals("Xeno")) {
                materialList = new Materials("fabric", "wool", "Pyrex");
                                
        } else if (dragon.getSpecies().equals("Nami")) {
                materialList = new Materials("fabric", "wool", "Pyrex");
               
        } else if (dragon.getSpecies().equals("Goggy")) {
                materialList = new Materials("fabric", "wool", "Pyrex");
               
        }

    }
    
    

    
}
