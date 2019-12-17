package design.pattern.singleton.basis;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        System.out.println("Instance is already exist!");
        return instance;
    }
}
