package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(12000);

        System.out.println("남은 잔액은 " + bankAccount.getBalance() + "원 입니다.");
    }
}

