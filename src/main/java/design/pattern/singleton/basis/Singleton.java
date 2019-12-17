package design.pattern.singleton.basis;

/*
* 缺少关键字 volatile 和 synchronized，会影响线程安全，但如果加上关键字，每次访问都要同步，会影响性能，消耗更多的资源
* */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Create instance!");
            instance = new Singleton();
        } else {
            System.out.println("Instance is already exist!");
        }
        return instance;
    }
}
