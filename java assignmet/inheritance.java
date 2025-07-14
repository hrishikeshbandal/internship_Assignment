class Parent {
    void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void sayHi() {
        System.out.println("Hi from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        c.sayHi();
    }
}