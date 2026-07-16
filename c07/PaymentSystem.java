import java.util.*;

interface payment{
    public void pay(double amount);
}

class CreditCard implements payment{
    public void pay(double amount){
        System.out.println();
    }
}

class PayPal implements payment{
    public void pay(double amount){
        System.out.println();
    }
}

class Bkash implements payment{
    public void pay(double amount){
        System.out.println();
    }
}

public class PaymentSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your full name, Sire?");

        String userName = sc.nextLine();


        

        sc.close();
    }
}
