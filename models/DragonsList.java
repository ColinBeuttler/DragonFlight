package models;

import java.util.ArrayList;

public class DragonsList {
    ArrayList<Dragon> dragons;

    public DragonsList() {
        this.dragons = new ArrayList<Dragon>();
    }

    public Dragon getDragon(int index) {
        return new Dragon(this.dragons.get(index));
    }

    public void setDragon(int index, Dragon dragon) {
        this.dragons.set(index, new Dragon(dragon));
    }

    public boolean add(Dragon dragon) {
        if (this.dragons.contains(dragon)) {
            return false;
        }
        this.dragons.add(new Dragon(dragon));
        return true;
    }

    public int assignDragon() {
        double ranDragon = Math.random() * dragons.size();
        return (int) ranDragon;
    }

    public String toString(int index) {
        return dragons.get(index).toString();
    }
}
