package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        int ans = singleton.add(2,3);
        System.out.println(ans);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton1));
    }
}
