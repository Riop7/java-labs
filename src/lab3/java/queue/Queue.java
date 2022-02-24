package lab3.java.queue;

import lab3.java.hierarchy.animal_sub.arthropoda_sub.Insecta;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.Orthoptera;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.Tettigoniidae;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private final List<T> elements;//List

    public Queue(int size) {
        elements = new ArrayList<>(size);
    }

    public void add(T object) {
        elements.add(object);
    }

    public T get(int i) throws QueueIsEmpty {
        return elements.get(i);
    }

    private int size() {
        return elements.size();
    }

    private boolean isEmpty() {
        return elements.isEmpty();
    }

     public Queue<? extends Insecta> produce() throws QueueIsFullException {
        Queue<Insecta> queue = new Queue<>(0);
        for (Object obj : elements) {
            if (obj instanceof Insecta) {
                queue.add((Insecta) obj);
            }
        }
        return queue;
    }

    public ArrayList<Queue<Insecta>> consume(Queue<? extends Insecta> queue) throws QueueIsFullException {
        Queue<Insecta> parentsOfTettigoniaCantas = new Queue<>(10);
        Queue<Insecta> parentsOfOrthoptera = new Queue<>(10);
        for (Object obj : elements) {
            if (obj instanceof Tettigoniidae) {
                parentsOfTettigoniaCantas.add((Insecta) obj);
            }
            if (obj instanceof Orthoptera) {
                parentsOfOrthoptera.add((Insecta) obj);
            }
        }
        ArrayList<Queue<Insecta>> listOfQueue = new ArrayList<>();
        listOfQueue.add(parentsOfOrthoptera);
        listOfQueue.add(parentsOfTettigoniaCantas);
        return listOfQueue;
    }
}