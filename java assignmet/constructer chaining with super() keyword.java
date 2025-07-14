class Parent4 {
    Parent4() {
        System.out.println("Parent Constructor");
    }
}

class Child4 extends Parent4 {
    Child4() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Child4();
    }
}