class Helper {
    public static void show() {
        System.out.println("Called from another class");
    }
}

public class StaticCall {
    public static void main(String[] args) {
       
        Helper.show();
    }
}