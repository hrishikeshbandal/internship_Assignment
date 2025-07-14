abstract class Shape2 {
    abstract void draw();
}

interface Colorable {
    void color();
}

class Circle2 extends Shape2 implements Colorable {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void color() {
        System.out.println("Coloring Circle");
    }

    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.draw();
        c.color();
    }
}