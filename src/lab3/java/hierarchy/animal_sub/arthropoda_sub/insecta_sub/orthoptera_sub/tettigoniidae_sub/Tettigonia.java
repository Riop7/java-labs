package lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.Tettigoniidae;

public class Tettigonia extends Tettigoniidae {
    public Tettigonia(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Tettigonia and my name is " + name;
    }
}
