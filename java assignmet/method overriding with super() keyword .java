class Parent3 {
    void message() {
        System.out.println("Message from Parent");
    }
}

class Child3 extends Parent3 {
    void message() {
        super.message();
        System.out.println("Message from Child");
    }

    public static void main(String[] args) {
        new Child3().message();
    }
}