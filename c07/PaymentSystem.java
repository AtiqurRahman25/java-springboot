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
            Boolean uInp = sc.nextBoolean();
            if(uInp){
                System.out.println("Pay Via : \n1. Credit Card\n2. PayPal\n3. Bkash");
                int uINP = sc.nextInt();
                switch (uINP) {
                    case 1:
                        p1.pay(userName, CC);
                        break;
                    case 2:
                        p2.pay(userName, paypal);
                        break;
                    case 3:
                        p3.pay(userName, bkash);
                        break;
                    default:
                        System.out.println("Wrong Input. Try again.");
                        continue;
                }
            }else{
                break;
            }
        }

        sc.close();
    }
}
