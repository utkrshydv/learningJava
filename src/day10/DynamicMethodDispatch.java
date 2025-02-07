package day10;

class Apple {
    void show() {
        System.out.println("Show method in Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Show method in Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Show method in Cherry");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Apple ref;
        ref = new Apple();
        ref.show();
        ref = new Banana();
        ref.show();
        ref = new Cherry();
        ref.show();
    }
}
