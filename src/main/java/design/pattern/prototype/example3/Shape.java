package design.pattern.prototype.example3;

public interface Shape extends Cloneable {
    Object clone();
    void countArea();
}
