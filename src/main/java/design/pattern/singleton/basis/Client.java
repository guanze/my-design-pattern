package design.pattern.singleton.basis;

public class Client {
    public static void main(String[] args) {
        System.out.println("[Singleton]==>Start");
        System.out.println("==>getInstance()");
        Singleton.getInstance();
        System.out.println("==>getInstance()");
        Singleton.getInstance();
        System.out.println("==>getInstance()");
        Singleton.getInstance();

        System.out.println("==============================");

        System.out.println("[LazySingleton]==>Start");
        System.out.println("==>getInstance()");
        LazySingleton.getInstance();
        System.out.println("==>getInstance()");
        LazySingleton.getInstance();
        System.out.println("==>getInstance()");
        LazySingleton.getInstance();

        System.out.println("==============================");

        System.out.println("[HungrySingleton]==>Start");
        System.out.println("==>getInstance()");
        HungrySingleton.getInstance();
        System.out.println("==>getInstance()");
        HungrySingleton.getInstance();
        System.out.println("==>getInstance()");
        HungrySingleton.getInstance();
    }
}
