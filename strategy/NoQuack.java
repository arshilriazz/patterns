package patterns.strategy;

public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("doesn't quack");
    }
}
