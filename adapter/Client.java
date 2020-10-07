package patterns.adapter;
public class Client {
    ITarget target = new Adapter(new Adaptee());
    void request(){
        target.request();
    }
}
