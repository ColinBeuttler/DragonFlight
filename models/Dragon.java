package models;

public class Dragon {

    public enum Gender {
        MALE, FEMALE
    }
    
    private String type;
    private String name;
    private Gender gender;

    public Dragon(String name, String type) {
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

    public String getType() {
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

    public void setType(String type) {
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

    public String toString() {
        return "\n\tLooks like a " + this.name + "\n";
    }
}
