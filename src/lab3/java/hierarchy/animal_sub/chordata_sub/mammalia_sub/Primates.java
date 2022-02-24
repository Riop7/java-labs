package lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub;

import lab3.java.hierarchy.animal_sub.chordata_sub.Mammalia;

public class Primates extends Mammalia {
    public Primates(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Primate and my name is " + name;
    }
}
