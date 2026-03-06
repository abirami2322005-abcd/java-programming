import java.util.Scanner;
public class Airline {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int weight=scan.nextInt();
        int rate=scan.nextInt();
        int priority=scan.nextInt();
        int insurance=scan.nextInt();
        int handling=scan.nextInt();
        int fuel=scan.nextInt();
        int cargorevenue=(weight*rate)+priority+insurance-handling-fuel;;
        System.out.println(cargorevenue);
    }
}