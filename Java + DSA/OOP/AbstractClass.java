package OOP;

public class AbstractClass {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj = new Child2();
        obj.carrer("vedu");
        obj1.carrer("Vedant");
    }
    
}
abstract class Parent {
    abstract void carrer(String name);
}
class Child1 extends Parent {
    void carrer(String name) {
        name = "Engineer";
        System.out.println(name);
    }
}
class Child2 extends Parent {
    void carrer(String name) {
        name = "Doctor";
        System.out.println(name);
    }
}
