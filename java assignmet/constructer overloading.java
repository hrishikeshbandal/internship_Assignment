public class OverloadConstructor {
    OverloadConstructor() {
        System.out.println("Default Constructor");
    }

    OverloadConstructor(int a) {
        System.out.println("Parameterized Constructor: " + a);
    }

    OverloadConstructor(String msg) {
        System.out.println("Constructor with String: " + msg);
    }

    public static void main(String[] args) {
        new OverloadConstructor();
        new OverloadConstructor(10);
        new OverloadConstructor("Hello");
    }
}