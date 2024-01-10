package inheritance.interfacee;

public interface Shape extends ShapeAncestor {
    // abstract method is method with no body
    void draw(); // compile time ===> public abstract void draw()

    void calculate();
}
