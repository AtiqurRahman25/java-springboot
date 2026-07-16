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
        double CC = 12000.43, paypal = 45000, bkash = 1400.98;
        
        payment p1 = new CreditCard();
        payment p2 = new PayPal();
        payment p3 = new Bkash();

        while (true) {
            System.out.println("Hi, "+userName+"\nDo you want to pay, Sire?");
            if(sc.next() == "y"){
                System.out.println("Okay");
            }else{
                break;
            }
        }

        
             

        sc.close();
    }
}
