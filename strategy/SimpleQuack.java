package patterns.strategy;

public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quacks normally");
    }
}
