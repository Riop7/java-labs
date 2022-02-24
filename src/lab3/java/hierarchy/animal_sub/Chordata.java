package lab3.java.hierarchy.animal_sub;

import lab3.java.hierarchy.Animal;

public class Chordata extends Animal {
    protected String name;
    public Chordata(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "I am Chordata and my name is " + name;
    }
}
