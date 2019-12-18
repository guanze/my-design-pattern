package design.pattern.prototype.example3;

public class ProtoTypeTest {
    public static void main(String[] args) {
        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
//        Circle obj1 = (Circle) protoTypeManager.getShape("Circle");
//        obj1.countArea();
        Shape obj1 = protoTypeManager.getShape("Circle");
        obj1.countArea();
        Shape obj2 = protoTypeManager.getShape("Square");
        obj2.countArea();
    }
}
