package lab3.java.hierarchy.animal_sub.chordata_sub;

import lab3.java.hierarchy.animal_sub.Chordata;

public class Mammalia extends Chordata {
    public Mammalia(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Mammalia and my name is " + name;
    }
}
