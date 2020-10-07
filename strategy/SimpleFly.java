package patterns.strategy;

public class SimpleFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flies like a normal bird");
    }
}
