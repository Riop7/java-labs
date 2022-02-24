package lab3.java;

import lab3.java.hierarchy.Animal;
import lab3.java.hierarchy.animal_sub.Chordata;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.Insecta;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.Tettigonia;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.tettigonia_sub.TettigoniaCantans;
import lab3.java.hierarchy.animal_sub.arthropoda_sub.insecta_sub.orthoptera_sub.tettigoniidae_sub.tettigonia_sub.Viridissima;
import lab3.java.hierarchy.animal_sub.chordata_sub.mammalia_sub.primates_sub.hominidae_sub.homo_sub.HomoHabilis;
import lab3.java.queue.Queue;
import lab3.java.queue.QueueIsEmpty;
import lab3.java.queue.QueueIsFullException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<Animal> queue = new Queue<>(10);

        Viridissima viridissima = new Viridissima("Vasya");
        TettigoniaCantans tettigoniaCantans = new TettigoniaCantans("Alex");
        HomoHabilis homoHabilis = new HomoHabilis("Faiz");
        Chordata chordata = new Chordata("Runner");

        try {
            queue.add(viridissima);
            queue.add(tettigoniaCantans);
            queue.add(homoHabilis);
            queue.add(chordata);
            Queue<? extends Insecta> produceResult = queue.produce();
            System.out.println(produceResult.get(0));
            ArrayList<Queue<Insecta>> consumeResult = queue.consume(produceResult);
            System.out.println(consumeResult.get(0).get(1));
        } catch (QueueIsFullException | QueueIsEmpty e) {
            e.printStackTrace();
        }
    }
}
