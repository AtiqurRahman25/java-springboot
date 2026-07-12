import java.util.*;

public class array {
    public static void main(String args[]){
        double myCGPA[] = new double[8];
        // double avgCGPA = 0.0;
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0; i<myCGPA.length; i++){
                System.out.print("Enter your semester " + (i+1) + " result:");
                myCGPA[i] = sc.nextDouble();
            }
        }
        for(int i = 0; i<myCGPA.length; i++){
            System.out.println(myCGPA[i]);
        }
    }
}
