package Chapter2;

import java.util.Scanner;

import Dialogue.Fillers;
import models.Dragon;

public class TheTailor {

    static Scanner scan = new Scanner(System.in);
    
   public static void tailorDialogue(Dragon dragon){
       System.out.println("Upon entering the tailor's shop, you see a tall slender figure before you...");
       Fillers.wait(2);
       System.out.println("The figure appears to be humanoid except that this figure is entirely made of metal.");
       Fillers.wait(2);
       System.out.println("His face is smooth and mostly featureless, save for two large glowing eyes and a small rectangular mouth.");
       Fillers.wait(2);
       System.out.println("Despit his unusually tall and slender proportions, he is wearing a vest perfectly fitted to his body, every single pocket is filled with sewing needles.");
       Fillers.wait(2);
       System.out.println("The shirt underneath is as clean as you have ever seen with the sleeves rolled up.");
       Fillers.wait(2);
       System.out.println("As he notices you walk in, his eyes became softer and more human...");
       Fillers.wait(2);
       System.out.println("'Hello there, I'm the tailor, what can I do for you?'");
       Fillers.wait(2);
       System.out.println("As he speaks, (dragon.getname) makes an appearence from your pocket.");
       Fillers.wait(2);
       System.out.println("'Ah a dragon rider I see, I assume your hear for a flight suit then?'");
       System.out.println("\n\tY/N?");
       String res = scan.nextLine();

       if (!(res.equalsIgnoreCase("y"))) {
           System.out.println("'I don't actually make anything else, and I've already been paid on your behalf...'");
           Fillers.wait(2);
           System.out.println("'So where were we?'");
       }

       Fillers.wait(2);
       System.out.println("'Looks like your dragon is a " + dragon.getSpecies() + ".'");
       Fillers.wait(2);
       System.out.println("'With that particular little guy, you will need a special suit...'");
       Fillers.wait(2);
       if (dragon.getSpecies().equals("Gore Magala")) {
           System.out.println("'a suit that can withstand the harshness of space and the resist disease.'");
       }
       else if (dragon.getSpecies().equals("Xeno'jiiva")) {
           System.out.println(
                   "'a suit that can withstand the harshness of space and withstand the shockwave of smashing solid rock.'");
       }
       else if (dragon.getSpecies().equals("Shara Ishvalda")) {
           System.out.println(
                   "'a suit that can shrug off gale force winds and the g-force from speed surges.'");
       }
       else if (dragon.getSpecies().equals("Namielle")) {
           System.out.println(
                   "'a suit that can shrug off lightning strikes and torrential downpours.'");
       }
       else if (dragon.getSpecies().equals("Malzeno")) {
           System.out.println(
                   "'a suit that can function in low light and resist those pesky symbiotes.'");
       }
       else if (dragon.getSpecies().equals("Gogmazios")) {
           System.out.println(
                   "'a suit that can fucntion in low light and withstand the shockwave of smashing solid rock.'");
       }
       System.out.println("'So quite straightforward really. I do need one thing from you though... the raw materials.'");
       Fillers.wait(2);


    }
}
