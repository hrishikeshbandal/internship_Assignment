class Car {
    void drive() {
        System.out.println("Driving car...");
    }
}

class Bike extends Car {
    void ride() {
        System.out.println("Riding bike...");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.drive();
        b.ride();
    }
}