package lab1.strategies;

public class CarStrategy implements MoveStrategy{
    @Override
    public void setMoveKind() {
        System.out.println("aaa");
    }

    @Override
    public String getMoveStrategy() {
        return "Car";
    }
}
