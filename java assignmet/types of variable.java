public class VariableDemo {
    static int staticVar = 10;
    int instanceVar = 20;

    void showVariables() {
        int localVar = 30;
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.showVariables();
    }
}