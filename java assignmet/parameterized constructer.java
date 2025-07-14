public class Employee2 {
    String name;
    double salary;

    Employee2(String n, double s) {
        name = n;
        salary = s;
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2("Hrishikesh",35000);
        e.show();
    }
}