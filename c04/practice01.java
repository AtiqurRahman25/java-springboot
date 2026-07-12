
/* Take an input from the user and find the index of the given input. */
import java.util.*;

public class practice01 {
    public static void main(String[] args) {

        int[] randomArr = {
            45, 12, 78, 34, 90, 23, 67, 89, 11, 56,
            32, 99, 18, 74, 41, 63, 27, 85, 50, 14,
            96, 37, 71, 29, 58, 83, 10, 65, 92, 47,
            21, 76, 39, 88, 53, 16, 97, 44, 69, 31,
            80, 25, 61, 94, 13, 72, 48, 86, 35, 59,
            17, 98, 42, 75, 28, 64, 91, 36, 81, 20,
            57, 84, 15, 93, 49, 70, 26, 60, 95, 38,
            82, 19, 54, 87, 30, 66, 100, 43, 68, 24,
            79, 33, 62, 55, 40, 73, 22, 77, 46, 51,
            9, 52, 8, 7, 6, 5, 4, 3, 2, 1
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number to search: ");
            int userSearch = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < randomArr.length; i++) {
                if (randomArr[i] == userSearch) {
                    System.out.println("Number found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            } else {
                System.out.println("Number not found. Please try again.\n");
            }
        }

        sc.close(); // Alternative of try
    }
}