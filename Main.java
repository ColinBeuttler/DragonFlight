import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Prints.*;
import models.Dragon;
import models.DragonsList;
import models.Egg;
import models.Dragon.Type;

import java.io.FileInputStream;

public class Main {

    static String DRAGONS_FILE = "dragons.txt";

    static DragonsList dragonList = new DragonsList();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\tWelcome to Dragon Flight");
        System.out.println("\n\tPress ENTER to continue");
        scan.nextLine();

        // System.out.print(DragonPrint.dragonPrint());

        System.out.println("\n\tGood Morning");
        wait(1);
        System.out.println("\n\tFinally awake I see....");
        wait(2);
        System.out.println("\n\tNow where were we?");
        wait(1);
        waitMessage(2);
        System.out.println("\n\t...Oh yes that's right!!!");
        wait(2);
        System.out.println("\n\tYou were about to pick a dragon egg...");
        wait(2);
        System.out.println("\n\tDid you make a decision yet?");
        wait(1);
        System.out.println("\n\tY/N?");

        String ans = scan.nextLine();

        // If they aren't ready to a pick an egg

        if (!(ans.equalsIgnoreCase("y"))) {
            System.out.println("\n\tNeed more time...");
            wait(2);
            System.out.println("\n\tor should I pick for you?");
            waitMessage(3);
        }

        System.out.println("\n\tThis egg look good?");
        wait(1);
        System.out.println("\n\tYou stare deep into the egg...");

        try {
            ArrayList<Dragon> dragons = readDragons();
            createList(dragons);
            Dragon dragonHatchling = dragonList.getDragon(dragonList.assignDragon());
            wait(1);
            Dragon.eggMessage(dragonHatchling);
            wait(2);
            System.out.println("\n\tY/N?");
            String res = scan.nextLine();

            // If they want to repick

            while (!(res.equalsIgnoreCase("y"))) {
                System.out.println("\n\tAnother one then?");
                waitMessage(2);
                System.out.println("\n\tHow about this one?");
                dragonHatchling = dragonList.getDragon(dragonList.assignDragon());
                wait(1);
                System.out.println("\n\tYou stare deep into this new egg placed in front of you...");
                wait(2);
                Dragon.eggMessage(dragonHatchling);
                wait(1);
                System.out.println("\n\tY/N?");
                res = scan.nextLine();
            }

            Egg unHatchedEgg = new Egg(false, 0);
            wait(1);
            while (unHatchedEgg.isHatched() == false) {
                wait(1);
                unHatchedEgg.careMessage();
                String careRes = scan.nextLine();
                wait(1);
                unHatchedEgg.eggCare(careRes);
                wait(1);
            }
                  
            waitMessage(1);
            System.out.println("\n\tI think it's hatching...");
            wait(3);

            System.out.println(DragonPrint.printBaby());
            System.out.println(Dragon.genderMessage(dragonHatchling));
            System.out.print(dragonHatchling);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }

    // ///////////////////////////////////Method Section

    // Read the dragon file
    public static ArrayList<Dragon> readDragons() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(DRAGONS_FILE);
        Scanner scanFile = new Scanner(fis);

        // Adds the lines of the dragon file to the ArrayList Dragons
        ArrayList<Dragon> dragons = new ArrayList<Dragon>();
        while (scanFile.hasNextLine()) {
            String[] list = scanFile.nextLine().split(",");
            dragons.add(new Dragon(list[0], Type.valueOf(list[1])));

        }
        scanFile.close();
        return dragons;
    }

    public static void createList(ArrayList<Dragon> dragons) {
        for (Dragon dragon : dragons) {
            dragonList.addDragon(dragon);
        } 
    }

    // Method that returns dialogue fillers for pauses in the conversation
    public static void waitMessage(int sec) {
        switch (sec) {
            case 1: {
                System.out.println("\n\tWWHHHAAATTTT!!!");
                wait(sec);
                break;
            }
            case 2: {
                System.out.println("\n\thmmmm...\n");
                wait(sec);
                break;
            }
            case 3: {
                wait(1);
                System.out.println("\n\tHold on...\n");
                wait(2);
                break;
            }
            case 5: {
                System.out.println("\n\tHope you don't want an answer before sundown hahahaha.....\n");
                wait(4);
                System.out.println("\tJk ;)\n");
                wait(1);
                break;
            }
            default: {
                System.out.println("\n\tThis may take a few minutes...\n");
                wait(sec);
            }
        }
    }

    // Method that creates the converation pauses

    public static void wait(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
