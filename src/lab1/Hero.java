package lab1;

import lab1.strategies.*;

import java.awt.Point;
import java.util.Objects;

public class Hero {
    private Point currentPoint;
    private MoveStrategy moveStrategy;

    public Point getCurrentPoint() {
        return currentPoint;
    }

    public Hero(Point point, String moveKind) {
        this.currentPoint = point;
        if (Objects.equals(moveKind, "Car")) {
            moveStrategy = new CarStrategy();
        } else if (Objects.equals(moveKind, "Walk")) {
            moveStrategy = new WalkStrategy();
        } else {
            System.out.println("Unknown move strategy");
        }
    }

    public void move(Point point) {
        System.out.printf("Person goes to (%d; %d) from (%d; %d) by %s", currentPoint.x, currentPoint.y, point.x, point.y, moveStrategy.getMoveStrategy());
        currentPoint = point;
    }
}
