public class OverloadDemo {
    void display() {
        System.out.println("No arguments");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int num) {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.display();
        obj.display("Sakshi");
        obj.display(100);
    }
}