package lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.tettigonia_sub;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.Tettigonia;

public class TettigoniaCantans extends Tettigonia {
    public TettigoniaCantans(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "I am Tettigonia Cantas and my name is " + name;
    }
}
