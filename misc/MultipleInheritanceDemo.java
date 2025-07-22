package lab8;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MultipleInheritance implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.methodA();
        obj.methodB();
    }
}
