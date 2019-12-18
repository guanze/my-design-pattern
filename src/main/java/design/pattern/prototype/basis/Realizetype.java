package design.pattern.prototype.basis;

public class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("具体原型创建成功");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
