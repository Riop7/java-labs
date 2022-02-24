package lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.Insecta;

public class Orthoptera extends Insecta {
    public Orthoptera(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Orthoptera and my name is " + name;
    }
}
