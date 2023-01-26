package models;

public class NamedDragon extends Dragon {
    
    public String name;


    public NamedDragon(String species, Type type, String origin, String keepers, String name, Gender gender) {
        super(species, type, origin, keepers, gender);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
