package lab3.java.hierarchy.animal_sub.arthropoda_sub;

import lab3.java.hierarchy.animal_sub.Arthropoda;

public class Insecta extends Arthropoda {
    public Insecta(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Insecta and my name is " + name;
    }
}
