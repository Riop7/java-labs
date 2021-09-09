package lab1;

import java.awt.Point;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input move strategy for your hero");
        String moveStrategy = input.nextLine();
        Hero hero = new Hero(new Point(1, 2), moveStrategy);
        Point point = new Point(16, 123);
        hero.move(point);
    }
}
