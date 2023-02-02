package Dialogue;

import java.util.concurrent.TimeUnit;

public class Fillers {

        // Method that returns dialogue fillers for pauses in the conversation
        public static void waitMessage(int sec) {
            switch (sec) {
                case 1: {
                    System.out.println("\n\t'WWHHHAAATTTT!!!'");
                    wait(sec);
                    break;
                }
                case 2: {
                    System.out.println("\n\t'hmmmm...'\n");
                    wait(sec);
                    break;
                }
                case 3: {
                    wait(1);
                    System.out.println("\n\t'Hold on...'\n");
                    wait(2);
                    break;
                }
                case 5: {
                    System.out.println("\n\t'Hope you don't want an answer before sundown hahahaha.....'\n");
                    wait(4);
                    System.out.println("\t'Jk ;)'\n");
                    wait(1);
                    break;
                }
                default: {
                    System.out.println("\n\t'This may take a few minutes...'\n");
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