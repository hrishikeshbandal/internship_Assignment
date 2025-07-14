public class BlockDemo {
    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    BlockDemo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        new BlockDemo();
    }
}