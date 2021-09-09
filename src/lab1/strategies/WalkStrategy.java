package lab1.strategies;

public class WalkStrategy implements MoveStrategy {
    @Override
    public void setMoveKind() {
        System.out.println("BBB");
    }

    @Override
    public String getMoveStrategy() {
        return "Walk";
    }
}
