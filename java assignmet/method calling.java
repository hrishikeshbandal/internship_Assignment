public class NonStaticCall {
    void greet() {
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        NonStaticCall obj = new NonStaticCall();
        obj.greet();
    }
}