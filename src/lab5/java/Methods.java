package lab5.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Methods {
    public static OptionalDouble firstTask() {
        return IntStream.range(1, 10).average();
    }

    public static List<String> secondTask(List<String> listStr) {
        Stream<String> stringStream = listStr.stream();
        return stringStream
                .map(String::toUpperCase)
                .map(string -> "_new_" + string)
                .collect(Collectors.toList());
    }

    public static Collection<Integer> thirdTask(Collection<Integer> numbers) {
        return numbers
                .stream()
                .filter(i -> Collections.frequency(numbers, i) == 1)
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    public static List<String> fourthTask(List<String> collectionOfStrings, String firstLetter) {
        return collectionOfStrings
                .stream()
                .filter(string -> string.substring(0, 1).equalsIgnoreCase(firstLetter))
                .sorted()
                .collect(Collectors.toList());
    }

    public static Integer fifthTask(Collection<Integer> simpleCollection) {
        var lastElement = simpleCollection
                .stream()
                .reduce((firstElement, secondElement) -> secondElement);
        if (lastElement.isPresent()) {
            return lastElement.get();
        }
        else {
            throw new RuntimeException("Your collection is empty!");
        }
    }

    public static int sixthTask(int[] arrayOfInt) {
        return Arrays
                .stream(arrayOfInt)
                .filter(x -> x % 2 == 0)
                .sum();
    }

    public static Map<Character, String> seventhTask(List<String> arrayStr) {
        return arrayStr
                .stream()
                .collect(Collectors.toMap(string->string.charAt(0), string -> string.substring(1)));
    }
}

