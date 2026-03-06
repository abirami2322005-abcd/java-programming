import java.util.Scanner;
public class Fuel{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int distance=scan.nextInt();
        int mileage=scan.nextInt();
        int fuelprice=scan.nextInt();
        int tollcharge=scan.nextInt();
        int fuel=distance/mileage;
        int fuelcost=fuel*fuelprice;
        int tripcost=fuelcost+tollcharge;
        System.out.println("Tripcost="+tripcost);
    }
}