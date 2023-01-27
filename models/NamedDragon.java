package models;

public class NamedDragon extends Dragon {
    
    public String name;


    public NamedDragon(String name, String species, Type type, String origin, String keepers, Gender gender) {
        super(species, type, origin, keepers, gender);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static NamedDragon creatNamedDragon(Dragon hatchling, String name) {
        return new NamedDragon(name, hatchling.getSpecies(), hatchling.getType(), hatchling.getOrigin(), hatchling.getKeepers(), hatchling.getGender());
    }

}
