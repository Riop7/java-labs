package lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub;

import lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.Primates;

public class Hominidae extends Primates {
    public Hominidae(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Hominidae and my name is " + name;
    }
}
