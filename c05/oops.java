import java.util.*;

class deutchCar{
    String modelName, bodyType;
    double price;

    // Method, as it is inside of a user defined class.
    public void details(){
        System.out.println("Deutch Car ("+modelName+") is open for sale.");
    }
}

public class oops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        deutchCar bmw = new deutchCar();

        bmw.modelName = "GLX200";
        bmw.bodyType = "SUV";
        bmw.price = 23000;

        bmw.details();
        
        sc.close();
    }
}
