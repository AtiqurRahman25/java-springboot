import java.util.*;
public class firstClass {
    public static void main(String[] args){
        // Loop & Function 
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::: Credentials :::::::::::");
        System.err.print("Enter your first name : ");
        String fname = sc.nextLine();
        System.err.print("Enter your last name : ");
        String lname = sc.nextLine();
        System.out.println("Hi, " + fname + " " + lname + " Welcome to SeismoGuard EEW System.");
    }
}
