package design.pattern.singleton.basis;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            System.out.println("Create instance!");
            instance = new LazySingleton();
        } else {
            System.out.println("Instance is already exist!");
        }
        return instance;
    }
}
