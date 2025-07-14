public class ThisDemo {
    int x;

    ThisDemo(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(100);
        obj.show();
    }
}