import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankSystem bank = new BankSystem();

        int choice;

        do {

            System.out.println("\n--- BANKING SYSTEM ---");
            System.out.println("1 Create Account");
            System.out.println("2 Login");
            System.out.println("3 Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(name, accNo, balance);
                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    int loginAcc = sc.nextInt();

                    BankAccount user = bank.login(loginAcc);

                    if (user == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    int option;

                    do {

                        System.out.println("\n1 Deposit");
                        System.out.println("2 Withdraw");
                        System.out.println("3 Balance");
                        System.out.println("4 Account Details");
                        System.out.println("5 Logout");

                        option = sc.nextInt();

                        switch (option) {

                            case 1:
                                System.out.print("Amount: ");
                                user.deposit(sc.nextDouble());
                                break;

                            case 2:
                                System.out.print("Amount: ");
                                user.withdraw(sc.nextDouble());
                                break;

                            case 3:
                                user.showBalance();
                                break;

                            case 4:
                                user.showDetails();
                                break;
                        }

                    } while (option != 5);

                    break;
            }

        } while (choice != 3);

        sc.close();
    }
}