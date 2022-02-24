package lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub.hominidae_sub.homo_sub;

import lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub.hominidae_sub.Homo;

public class HomoHabilis extends Homo {
    public HomoHabilis(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am HomoHabilis and my name is " + name;
    }
}
