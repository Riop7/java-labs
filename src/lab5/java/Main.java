package lab5.java;

import java.util.*;

import static lab5.java.Methods.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------First task---------");
        OptionalDouble average = firstTask();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

        System.out.println("-------Second task---------");
        List<String> arrayStr = new ArrayList<>();
        arrayStr.add("aboba");
        arrayStr.add("chordata");
        arrayStr.add("Vasya");
        arrayStr.add("DenisSergeevich");
        arrayStr.add("Cat");

        List<String> finalArrayStr = secondTask(arrayStr);
        finalArrayStr.forEach(System.out::println);

        System.out.println("--------Third task----------");
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);

        Collection<Integer> quadrates = thirdTask(numbers);
        quadrates.forEach(System.out::println);

        System.out.println("--------Fourth task---------");
        var finalCollectionOfStrings = fourthTask(arrayStr, "A");
        finalCollectionOfStrings.forEach(System.out::println);

        System.out.println("-------Fifth task--------");
        List<Integer> emptyCollection = new ArrayList<>();
        try {
            Integer integer = fifthTask(numbers);
            System.out.println(integer);
            System.out.println("\nEmpty collection test");
            fifthTask(emptyCollection);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------Sixth task--------");
        int[] integers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(sixthTask(integers));

        System.out.println("---------SEVENTH TASK--------");
        Map<Character, String > map = seventhTask(arrayStr);
        System.out.println(map);
    }
}
