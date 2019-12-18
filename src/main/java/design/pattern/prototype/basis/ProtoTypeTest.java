package design.pattern.prototype.basis;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype) realizetype1.clone();
        System.out.println("realizetype1==realizetype2 ? ["+(realizetype1==realizetype2)+"]");
    }
}
