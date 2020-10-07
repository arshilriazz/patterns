package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(new NoFly(), new SimpleQuack());
        duck.quack();
        duck.fly();
//        Duck duck1 = new Duck(new NoFly(), new SimpleQuack());
//        System.out.println(duck.equals(duck1));
    }
}
