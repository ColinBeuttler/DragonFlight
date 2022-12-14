import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Prints.DragonPrint;
import models.Dragon;
import models.DragonsList;

import java.io.FileInputStream;

public class Main {

    static DragonsList dragons = new DragonsList();

    public static void main(String[] args) {

        // System.out.print(DragonPrint.dragonPrint());

        System.out.println("\n\tGood Morning");
        wait(1);
        System.out.println("\n\tFinally awake I see....");

        Scanner scan = new Scanner(System.in);

        wait(1);
        System.out.println("\n\tNow where were we?");
        waitMessage(2);
        System.out.println("\n\t...Oh yes that's right!!!");
        wait(1);
        System.out.println("\n\tYou were about to pick a dragon egg...");
        wait(1);
        System.out.println("\n\tDid you make a decision yet?");
        wait(1);
        System.out.println("\n\tY/N?");

        String ans = scan.nextLine();

        if (!(ans.equalsIgnoreCase("y"))) {
            System.out.println("\n\tNeed more time then?");
            wait(1);
            System.out.println("\n\tor should i pick for you?");
        }

        waitMessage(1);
        System.out.println("\n\tThis egg look good?");
        wait(1);
        System.out.println("\n\tY/N?");

        String res = scan.nextLine();

        while (!(res.equalsIgnoreCase("y"))) {
            System.out.println("\n\tAnother on then?");
            scan.nextLine();
            waitMessage(2);
            System.out.println("\n\tHow about this one?");
            wait(1);
            System.out.println("\n\tY/N?");
            res = scan.nextLine();
        }

        waitMessage(3);
        System.out.println("\n\tI think it's hatching...");


// Runs the Methods after an egg is picked
        try {
            readDragons("dragons.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {

            System.out.println(DragonPrint.printBaby());
            System.out.print(dragons.toString(dragons.assignDragon()));
        }

        scan.close();
    }
    

// ///////////////////////////////////Method Section

    // Read the dragon file 
    public static void readDragons(String txt) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(txt);
        Scanner scanFile = new Scanner(fis);

        // Adds the lines of the dragon file to the ArrayList Dragons
        while (scanFile.hasNextLine()) {
            String[] names = scanFile.nextLine().split(",");
            for (int i = 0; i < names.length; i++) {
                dragons.add(new Dragon(names[i]));
            }
        }
        scanFile.close();
    }



// Method that returns dialogue fillers for pauses in the conversation
public static void waitMessage(int sec) {
    switch (sec) {
        case 2: {
            System.out.println("\n\thmmmm...\n");
            wait(sec);
            break;
        }
        case 3: {
            System.out.println("\n\tHold on...\n");
            wait(sec);
            break;
        }
        case 5: {
            System.out.println("\n\tHope you don't want an answer before sundown hahahaha.....\n");
            wait(4);
            System.out.println("\tJk\n");
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
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
