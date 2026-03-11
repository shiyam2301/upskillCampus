import java.util.ArrayList;

class BankSystem {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    void createAccount(String name, int accNo, double balance) {
        BankAccount acc = new BankAccount(name, accNo, balance);
        accounts.add(acc);
        System.out.println("Account Created Successfully!");
    }

    BankAccount login(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo) {
                return acc;
            }
        }
        return null;
    }
}