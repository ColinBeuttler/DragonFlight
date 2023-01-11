package models;

import java.util.Objects;

public class Dragon{

    public enum Gender {
        MALE, FEMALE
    }

    public enum Type {
        BEHEMOTH, WYRM, FAE
    }
    
    private Type type;
    private String name;
    private Gender gender;
    private double size;

    public Dragon(String name, Type type) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
        this.type = type;
        this.gender = determineGender();
        this.size = determineSize();
    }

    public Dragon(Dragon source) {
        this.name = source.name;
        this.type = source.type;
        this.gender = source.gender;
        this.size = source.size;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Gender determineGender() {
        int gender = (int) Math.round(Math.random());
        if (gender < 1) {
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
        }
    }

    private double determineSize() {
        double randSize = 0.0;
        if (this.getType().equals(Type.BEHEMOTH)) {
            randSize = (Math.random() * (3800 - 4600) + 3800);
        }
        else if (this.getType().equals(Type.WYRM)) {
            randSize = (Math.random() * (2100 - 2700) + 2100);
        }
        else if (this.getType().equals(Type.FAE)) {
            randSize = (Math.random() * (1750 - 2350) + 1750);
        }
        return randSize;
    }

    public static String genderMessage(Dragon hatchling) {
        if (hatchling.getGender().equals(Gender.FEMALE)) {
            return "\n\tIt's a girl";
        } else if (hatchling.getGender().equals(Gender.MALE)) {
            return "\n\tIt's a boy";
        }
        return null;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Dragon)) {
            return false;
        }
        Dragon dragon = (Dragon) obj;
        return Objects.equals(name, dragon.name) && Objects.equals(type, dragon.type)
                && Objects.equals(gender, dragon.gender);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, type, gender);
    }

    public String toString() {
        return "\n\tLooks like a " + this.name + "\n";
    }
}
