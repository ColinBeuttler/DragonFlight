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
    private String origin;
    private String keepers;

    public Dragon(String name, Type type, String origin, String keepers) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.keepers = keepers;
        this.gender = determineGender();
        this.size = determineSize();
    }

    public Dragon(Dragon source) {
        this.name = source.name;
        this.type = source.type;
        this.origin = source.origin;
        this.keepers = source.keepers;
        this.gender = source.gender;
        this.size = source.size;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }

    public String getKeepers() {
        return keepers;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSize() {
        return size;
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

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setKeepers(String keepers) {
        this.keepers = keepers;
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
            randSize = (Math.random() * (4600 - 3800) + 3800);
        }
        else if (this.getType().equals(Type.WYRM)) {
            randSize = (Math.random() * (2700 - 2100) + 2100);
        }
        else if (this.getType().equals(Type.FAE)) {
            randSize = (Math.random() * (2350 - 1750) + 1750);
        }
        return Math.round(randSize*100.00)/100.00;
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
                && Objects.equals(gender, dragon.gender) && Objects.equals(origin, dragon.origin) && Objects.equals(keepers, dragon.keepers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, type, gender, origin, keepers);
    }

    public String toString() {
        return "\n\tLooks like it's something called a " + this.name + "\n";
    }
}
