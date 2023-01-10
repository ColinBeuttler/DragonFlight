package models;

import java.util.Objects;

public class Dragon {

    public enum Gender {
        MALE, FEMALE
    }

    public enum Type {
        BEHEMOTH, WYRM, FAE
    }
    
    private Type type;
    private String name;
    private Gender gender;

    public Dragon(String name, Type type) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
        this.type = type;
        this.gender = determineGender();
    }

    public Dragon(Dragon source) {
        this.name = source.name;
        this.type = source.type;
        this.gender = source.gender;
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

    public static String genderMessage(Dragon hatchling) {
        if (hatchling.getGender().equals(Gender.FEMALE)) {
            return "\n\tIt's a girl";
        } else if (hatchling.getGender().equals(Gender.MALE)) {
            return "\n\tIt's a boy";
        }
        return null;
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
