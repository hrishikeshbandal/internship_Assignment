public class encapsulation {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        encapsulation acc = new encapsulation();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}