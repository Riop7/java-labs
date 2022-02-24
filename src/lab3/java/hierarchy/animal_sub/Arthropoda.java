package lab3.java.hierarchy.animal_sub;

import lab3.java.hierarchy.Animal;

public class Arthropoda extends Animal {
    protected String name;
    public Arthropoda(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "I am Arthropoda and my name is " + name;
    }
}
