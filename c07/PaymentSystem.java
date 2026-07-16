import java.util.*;

interface payment{
    public void pay(String item, double amount);
}

class CreditCard implements payment{
    public void pay(String item, double amount){
        System.out.println("Hi, Sire - "+ item + "!!\n"+"Payment "+amount+" has completed.");
    }
}

class PayPal implements payment{
    public void pay(String item, double amount){
        System.out.println("Hi, Sire - "+ item + "!!\n"+"Payment "+amount+" has completed.");
    }
}

class Bkash implements payment{
    public void pay(String item, double amount){
        System.out.println("Hi, Sire - "+ item + "!!\n"+"Payment "+amount+" has completed.");
    }
}

public class PaymentSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your full name, Sire?");

        String userName = sc.nextLine();
        payment p1 = new CreditCard();
        payment p2 = new PayPal();
        payment p3 = new Bkash();

        p1.pay(userName, 1345.65);
        p2.pay(userName, 21.65);
        p3.pay(userName, 345.65);
             

        sc.close();
    }
}
