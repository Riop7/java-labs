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

    public Hero(Point currentPoint, String moveKind) {
        this.currentPoint = currentPoint;
        if (Objects.equals(moveKind, "Car")) {
            moveStrategy = new CarStrategy();
        } else if (Objects.equals(moveKind, "Walk")) {
            moveStrategy = new WalkStrategy();
        } else {
            System.out.println("Unknown move strategy");
        }
    }

    public void move(Point point){
        System.out.println("Person goes to (" + currentPoint.x + "; " + currentPoint.y + ") from (" + point.x + "; " + point.y + ") by " + moveStrategy.getMoveStrategy());
        currentPoint = point;
    }
}
