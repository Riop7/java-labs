package lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.tettigonia_sub;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.Tettigonia;

public class Viridissima extends Tettigonia {
    public Viridissima(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Viridissima and my name is " + name;
    }
}

