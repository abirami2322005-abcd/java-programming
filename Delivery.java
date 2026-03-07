import java.util.Scanner;
public class Delivery{
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int deliveries=scan.nextInt();
    int payout=scan.nextInt();
    int incentive=scan.nextInt();
    int fuelcost=scan.nextInt();
    int driverearnings=(deliveries*payout)+incentive-fuelcost;
    System.out.println("Driverearnings="+driverearnings);
    }
}