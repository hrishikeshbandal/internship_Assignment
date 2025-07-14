class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}

class Parent5 extends Grandparent {
    void parentMessage() {
        System.out.println("Message from Parent");
    }
}

class Child5 extends Parent5 {
    void childMessage() {
        System.out.println("Message from Child");
    }

    public static void main(String[] args) {
        Child5 c = new Child5();
        c.greet();
        c.parentMessage();
        c.childMessage();
    }
}