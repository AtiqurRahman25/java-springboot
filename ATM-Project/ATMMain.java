import java.util.Scanner;

public class ATMMain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int CORRECT_PIN = 1234;
    private static final int MAX_PIN_ATTEMPTS = 3;

    private static double userBalance = 5000.00;

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("         WELCOME TO ATM");
        System.out.println("================================");

        if (!authenticateUser()) {
            System.out.println("Too many incorrect attempts.");
            System.out.println("Your account has been temporarily locked.");
            scanner.close();
            return;
        }

        runATM();

        scanner.close();
        System.out.println("\nThank you for using our ATM.");
    }

    private static boolean authenticateUser() {

        for (int attempt = 1; attempt <= MAX_PIN_ATTEMPTS; attempt++) {

            System.out.print("Enter your PIN: ");
            int pin = readInteger();

            if (pin == CORRECT_PIN) {
                System.out.println("\nLogin successful.");
                return true;
            }

            int remainingAttempts = MAX_PIN_ATTEMPTS - attempt;

            if (remainingAttempts > 0) {
                System.out.println(
                    "Incorrect PIN. Attempts remaining: " + remainingAttempts
                );
            }
        }

        return false;
    }

    private static void runATM() {

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = readInteger();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please select 1-4.");
            }
        }
    }

    private static void displayMenu() {

        System.out.println("\n================================");
        System.out.println("           ATM MENU");
        System.out.println("================================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("================================");
        System.out.print("Choose an option: ");
    }

    private static void checkBalance() {

        System.out.printf(
            "\nCurrent Balance: %.2f%n",
            userBalance
        );
    }

    private static void depositMoney() {

        System.out.print("\nEnter deposit amount: ");
        double amount = readDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }

        userBalance += amount;

        System.out.printf(
            "Deposit successful. New balance: %.2f%n",
            userBalance
        );
    }

    private static void withdrawMoney() {

        System.out.print("\nEnter withdrawal amount: ");
        double amount = readDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }

        if (amount > userBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        userBalance -= amount;

        System.out.printf(
            "Withdrawal successful. New balance: %.2f%n",
            userBalance
        );
    }

    private static int readInteger() {

        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static double readDouble() {

        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }

        return scanner.nextDouble();
    }
}