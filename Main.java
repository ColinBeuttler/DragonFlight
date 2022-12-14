import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Dragon;
import models.DragonsList;

import java.io.FileInputStream;

public class Main {

    static DragonsList dragons = new DragonsList();

    public static void main(String[] args) {

        System.out.println("java working");

        try {
            loadDragons("dragons.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.print(dragons.toString(dragons.assignDragon()));
        }
    }

    public static void loadDragons(String txt) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(txt);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] names = line.split(",");
            for (int i = 0; i < names.length; i++) {
                dragons.add(new Dragon(names[i]));
            }
        }
        scanFile.close();
    }
}
