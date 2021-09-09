package lab1;

import lab1.strategies.*;

import java.util.Objects;

public class Hero {
    private Point currentPoint;
    private MoveStrategy moveStrategy;
    public Point getCurrentPoint() {
        return currentPoint;
    }

    public Hero(String moveKind) {
        if (Objects.equals(moveKind, "Car")) {
            moveStrategy = new CarStrategy();
        } else if (Objects.equals(moveKind, "Walk")) {
            moveStrategy = new WalkStrategy();
        }
    }
    public void move(Point point){
        System.out.println("Person goes to another point by " + moveStrategy.getMoveStrategy());
        currentPoint = point;
    }
}
