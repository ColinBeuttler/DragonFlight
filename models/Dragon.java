package models;

public class Dragon {
    private String name;

    public Dragon(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public Dragon(Dragon source) {
        this.name = source.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "You will be riding " + this.name;
    }
}
