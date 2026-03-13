import java.util.Scanner;
public class Conditional21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int units=scan.nextInt();
        scan.nextLine();
        String customerType=scan.nextLine();
        String season=scan.nextLine();
        String paymentMethod=scan.nextLine();

        double r1=0, r2=0, r3=0, r4=0;


        if(customerType.equals("Residential")){
            r1=0.10; r2=0.15; r3=0.25; r4=0.30;
        }
        else if(customerType.equals("Commercial")){
            r1=0.12; r2=0.18; r3=0.25; r4=0.25;
        }
        else if(customerType.equals("Industrial")){
            r1=0.08; r2=0.12; r3=0.20; r4=0.20;
        }

        double t1=0,t2=0,t3=0,t4=0;

        if(units>0){
            int u=Math.min(units,100);
            t1=u*r1;
        }
        if(units>100){
            int u=Math.min(units-100,200);
            t2=u*r2;
        }
        if(units>300){
            int u=Math.min(units-300,200);
            t3=u*r3;
        }
        if(units>500){
            int u=units-500;
            t4=u*r4;
        }
        double subtotal=t1+t2+t3+t4;
        int seasonalPercent=0;
        double seasonalFactor=0;
        if(season.equals("Summer")){
            seasonalPercent=15;
            seasonalFactor=0.15;
        }
        else if(season.equals("Winter")){
            seasonalPercent=-10;
            seasonalFactor=-0.10;
        }
        else{
            seasonalPercent=0;
            seasonalFactor=0;
        }

        double afterSeason=subtotal+(subtotal*seasonalFactor);

        int discountPercent=0;
        double discountFactor=0;
        if(paymentMethod.equals("Auto-Pay")){
            discountPercent=5;
            discountFactor=0.05;
        }
        else if(paymentMethod.equals("Online")){
            discountPercent=3;
            discountFactor=0.03;
        }
        else{
            discountPercent=0;
            discountFactor=0;
        }

        double total=afterSeason-(afterSeason*discountFactor);

        double avg=0;
        if(units>0){
            avg=total/units;
        }

        System.out.println("Units Consumed: "+units+" kWh");
        System.out.println("Customer Type: "+customerType);
        System.out.println("Season: "+season);
        System.out.println("Payment Method: "+paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $"+t1);
        System.out.println("Tier 2 Cost (101-300): $"+t2);
        System.out.println("Tier 3 Cost (301-500): $"+t3);
        System.out.println("Tier 4 Cost (501+): $"+t4);
        System.out.println("Seasonal Adjustment: "+seasonalPercent+"%");
        System.out.println("Payment Discount: "+discountPercent+"%");
        System.out.printf("Total Bill: $%.2f\n",total);
        System.out.printf("Average Rate: $%.2f/kWh\n",avg);
        scan.close();
    }
}