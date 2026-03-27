import java.util.Scanner;
public class COnditional10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String orderType=scan.nextLine();
        String loyalty=scan.nextLine();
        double orderValue=scan.nextDouble();
        scan.nextLine();
        String timeSlot=scan.nextLine();
        int discount=0;
        if(loyalty.equals("Gold"))
            discount=15;
        else if(loyalty.equals("Silver"))
            discount=10;
        else if(loyalty.equals("Bronze"))
            discount=5;
        if(timeSlot.equals("Late-Night"))
            discount+=5;
        double serviceFee=0;
        if(orderType.equals("Delivery"))
            serviceFee=orderValue * 0.10;
        else if(orderType.equals("Takeout"))
            serviceFee=orderValue * 0.03;
        double discountedValue=orderValue*(1-discount/100.0);
        double finalAmount=discountedValue+serviceFee;

        String priority="";
        int prepTime=0;

        if(timeSlot.equals("Peak")&&orderType.equals("Delivery")){
            priority="High";
            prepTime=25;
        }
        else if(timeSlot.equals("Regular")){
            priority="Medium";
            prepTime=20;
        }
        else{
            priority="Low";
            prepTime=15;
        }
        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyalty);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + discount + "%");
        System.out.println("Time-Based Adjustment: 0%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");
        scan.close();
    }
}