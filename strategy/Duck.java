package patterns.strategy;

public class Duck {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;
    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
    public void fly() {
        this.flyBehaviour.fly();
    }
    public void quack() {
        this.quackBehaviour.quack();
    }
}
