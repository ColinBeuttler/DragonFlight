package Dialogue;
import models.Dragon;
import models.Dragon.Gender;
import models.Dragon.Type;

public class UponHatch {

    // dialogue message upon hatching, tell the new dragon's gender
    public static String genderMessage(Dragon hatchling) {
        if (hatchling.getGender().equals(Gender.FEMALE)) {
            return "\n\tIt's a girl";
        } else if (hatchling.getGender().equals(Gender.MALE)) {
            return "\n\tIt's a boy";
        }
        return null;
    }
//  dialogue message that hints at the contents of the egg, once one is picked
    public static void eggMessage(Dragon dragon) {
        if (dragon.getType().equals(Type.BEHEMOTH)) {
            System.out.println(
                    "\n\t...within the egg's great deeps you sense a cold fathomless light, akin to the endless depths of the tunnels dug by the Mountain Dwarves.");
        } else if (dragon.getType().equals(Type.WYRM)) {
            System.out.println(
                    "\n\t...within the egg, you see a radiant glow dancing within, both fast and graceful.");
        } else if (dragon.getType().equals(Type.FAE)) {
            System.out.println(
                    "\n\t...within the egg, you sense both calm and ferocity. A brilliant interior with veiled edges constantly moving like a swilrling typhoon.");
        } else {
            System.out.println("\n\tType not specified");
        }

    }
}
