public class ThisCall {
    ThisCall() {
        this(10);
        System.out.println("Default Constructor");
    }

    ThisCall(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new ThisCall();
    }
}