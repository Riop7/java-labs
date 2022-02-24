package lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.Orthoptera;

public class Tettigoniidae extends Orthoptera {
    public Tettigoniidae(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Tettigoniidae and my name is " + name;
    }
}
