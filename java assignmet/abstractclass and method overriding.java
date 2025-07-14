abstract class BankAccount {
    abstract void calculateInterest();
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest calculated for Savings Account");
    }

    public static void main(String[] args) {
        new SavingAccount().calculateInterest();
    }
}