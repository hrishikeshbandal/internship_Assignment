class Parent2 {
    int x = 50;
}

class Child2 extends Parent2 {
    void show() {
        System.out.println("Parent x: " + super.x);
    }

    public static void main(String[] args) {
        new Child2().show();
    }
}