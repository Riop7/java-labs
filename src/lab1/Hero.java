package lab1;

import lab1.strategies.*;

import java.awt.Point;
import java.util.Objects;

public class Hero {
    private Point currentPoint;
    private MoveStrategy moveStrategy;

    public Hero(Point point, String moveKind) {
        this.currentPoint = point;
        setMoveStrategy(moveKind);
    }

    public void setMoveStrategy(String moveKind) {
        if (Objects.equals(moveKind, "Car")) {
            moveStrategy = new CarStrategy();
        } else if (Objects.equals(moveKind, "Walk")) {
            moveStrategy = new WalkStrategy();
        } else {
            System.out.println("Unknown move strategy. Move strategy set default value(Walk)");
            moveStrategy = new WalkStrategy();
        }
        System.out.println("Move strategy set " + moveKind);
    }

    public void move(Point point) {
        System.out.printf("Hero goes to (%d; %d) from (%d; %d) by %s", currentPoint.x, currentPoint.y, point.x, point.y, moveStrategy.getMoveStrategy());
        currentPoint = point;
    }
}
