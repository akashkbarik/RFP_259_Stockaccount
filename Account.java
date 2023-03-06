import java.util.Scanner;

public class Account {
    int accountBalance = 0;
    static Scanner sc = new Scanner(System.in);

    void debit() {
        System.out.print("enter the debit amount : ");
        int debitAmount = sc.nextInt();
        if (accountBalance > debitAmount) {
            accountBalance -= debitAmount;
        } else System.out.println("Amount exceeds account balance!");
            System.out.println("balance after debit : " + accountBalance);
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.print("enter account balance : ");
        account.accountBalance = sc.nextInt();
        account.debit();

    }
}
