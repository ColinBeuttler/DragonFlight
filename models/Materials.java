package models;

public class Materials {
    
    private String primary;
    private String secondary;
    private String specailty;


    public Materials(String primary, String secondary, String specailty) {
        this.primary = primary;
        this.secondary = secondary;
        this.specailty = specailty;
    }

    public Materials(Materials source) {
        this.primary = source.primary;
        this.secondary = source.secondary;
        this.specailty = source.specailty;
    }


    public String getPrimary() {
        return this.primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return this.secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getSpecailty() {
        return this.specailty;
    }

    public void setSpecailty(String specailty) {
        this.specailty = specailty;
    }

    public String toString() {
        return "\n\tMaterial List: \n" + this.primary + "\n" + this.secondary + "\n" + this.specailty;
    }
}
