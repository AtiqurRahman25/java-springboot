import java.util.*;
public class project {
    public static void main(String[] args) {
        System.out.println("Hi Welcome to SeismoGuard EEWS Software.");
        int userInput = 0;
        String userName = "";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What is full name please? ");
            userName = sc.nextLine();
            System.out.println("Hi " + userName + ", Welcome to SeismoGuard EEWS Software.");
            System.out.println("Please Check our list:");
            System.out.println("1. Check Live Earthquake Data");
            System.out.println("2. Check Nearby Seismic Activity");
            System.out.println("3. Exit");
            userInput = sc.nextInt();
        }
        switch (userInput) {
            case 1:
                System.out.println("You have selected to check live earthquake data.");
                break;
            case 2:
                System.out.println("You have selected to check nearby seismic activity.");
                break;
            case 3:
                System.out.println("Exiting the program. Thank you!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }
}
