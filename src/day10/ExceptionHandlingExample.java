package day10;
import java.io.IOException;

class SuperClass {
    void readFile() throws IOException {
        throw new IOException("File not found");
    }
}

class SubClass extends SuperClass {
    @Override
    void readFile() {
        try {
            super.readFile();
        } catch (IOException e) {
            System.out.println("Exception handled in subclass: " + e.getMessage());
        }
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.readFile();
    }
}
