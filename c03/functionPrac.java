import java.util.*;

public class functionPrac {
    public static void SeismoGuard(int x){
        switch (x){
            case 1:
                System.out.println("There is no active seismic event nearby.");
                break;
            case 2:
                System.out.println("1. Dhaka\n2.Comilla\n3.chattogram");
                break;
            case 3:
                System.out.println("P-wave is the primary wave.");
                break;
            case 4:
                System.out.println("S-wave is the secondary wave.");
                break;
            case 5:
                System.out.println("Md. Atiqur Rahman Sifat\nID: 0432410005101124.");
                break;
            default:
                System.out.println("Please choose between (1-5) and try again.");
                break;
        }
    }
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("::::: Welcome to SeismoGuard :::::\nChoose options below:");
            while (true){
                System.out.println("1. Live Seismic Event");
                System.out.println("2. Monitor Area Coverage");
                System.out.println("3. P-wave Info");
                System.out.println("4. S-wave Info");
                System.out.println("5. Contact");
                System.out.println("6. Exit");
                int userInput = sc.nextInt();
                if(userInput == 6){
                    break;
                }else{
                    //int userInput = sc.nextInt();
                    SeismoGuard(userInput);
                }
            }
        }
    }
}
