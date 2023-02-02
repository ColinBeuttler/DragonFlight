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
    private String species;
    private Gender gender;
    private String origin;
    private String keepers;

    public Dragon(String species, Type type, String origin, String keepers, Gender gender) {
        if (species == null || species.isBlank()) {
            throw new IllegalArgumentException("species cannot be null or blank");
        }
        this.species = species;
        this.type = type;
        this.origin = origin;
        this.keepers = keepers;
        this.gender = gender;
    }

    public Dragon(Dragon source) {
        this.species = source.species;
        this.type = source.type;
        this.origin = source.origin;
        this.keepers = source.keepers;
        this.gender = source.gender;
    }

    public String getSpecies() {
        return species;
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


    public void setSpecies(String species) {
        if (species == null || species.isBlank()) {
            throw new IllegalArgumentException("species cannot be null or blank");
        }
        this.species = species;
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


    public static Gender determineGender() {
        int gender = (int) Math.round(Math.random());
        if (gender < 1) {
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
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
        return Objects.equals(species, dragon.species) && Objects.equals(type, dragon.type)
                && Objects.equals(gender, dragon.gender) && Objects.equals(origin, dragon.origin) && Objects.equals(keepers, dragon.keepers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(species, type, gender, origin, keepers);
    }

    public String toString() {
        return "\n\tLooks like it's something called a " + this.species + "\n";
    }
}
