abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = πr²");
    }
}

class abstract extends Shape {
    void area() {
        System.out.println("Rectangle area = l × b");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();
        Shape s2 = new Rectangle();
        s2.area();
    }
}