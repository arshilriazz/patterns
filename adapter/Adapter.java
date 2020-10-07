package patterns.adapter;

public class Adapter implements ITarget{
    Adaptee adaptee;
    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
