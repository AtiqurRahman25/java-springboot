import java.util.*;

interface Restaurant {
    void prepareOrder(String item1, String item2);
}

class KFC implements Restaurant {
    public void prepareOrder(String item1, String item2) {
        System.out.println(item1 + ", your " + item2 + " order is being prepared at KFC.");
    }
}

class BurgerKing implements Restaurant {
    public void prepareOrder(String item1, String item2) {
        System.out.println(item1 + ", your " + item2 + " order is being prepared at Burger King.");
    }
}

class PizzaHut implements Restaurant {
    public void prepareOrder(String item1, String item2) {
        System.out.println(item1 + ", your " + item2 + " order is being prepared at Pizza Hut.");
    }
}

public class javaInterface {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(":::: Welcome to Rehman ::::");
            System.out.print("What is your full name please: ");

            String userName = sc.nextLine();

            Restaurant r1 = new KFC();
            Restaurant r2 = new BurgerKing();
            Restaurant r3 = new PizzaHut();

            r1.prepareOrder(userName, "Chicken Wings");
            r2.prepareOrder(userName, "Naga Wings");
            r3.prepareOrder(userName, "Salted Wings");

            break;
        }

        sc.close();
    }
}