package lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub.hominidae_sub;

import lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub.Hominidae;

public class Homo extends Hominidae {
    public Homo(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am Homo and my name is " + name;
    }
}
