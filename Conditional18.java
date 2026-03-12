import java.util.Scanner;
public class Conditional18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        String movieFormat=scan.nextLine();
        
        String showTime=scan.nextLine();
        
        String seatCategory=scan.nextLine();
        
        String customerType=scan.nextLine();


        double baseTicketprice=12;
        double formatsurcharge=0;
        double seatupgradefee=0;
        int timebasedadjustment=0;
        int customerdiscount=0;
        String pricingCategory="Value";
        String Concession="No";


        if(movieFormat.equals("2D")){
            formatsurcharge=0;
        }
        else if(movieFormat.equals("3D")){
            formatsurcharge=5;
        }
        else if(movieFormat.equals("IMAX")){
            formatsurcharge=8;
        }
        else if(movieFormat.equals("4DX")){
            formatsurcharge=10;
        }
        if(seatCategory.equals("Standard")){
            seatupgradefee=0;
        }
        else if(seatCategory.equals("Premieum")){
            seatupgradefee=4;
        }
        else if(seatCategory.equals("Recliner")){
            seatupgradefee=7;
        }
        if(showTime.equals("Matinee")){
            timebasedadjustment=-30;
        }
        else if(showTime.equals("Evening")){
            timebasedadjustment=0;
        }
        else if(showTime.equals("Prime-Time")){
            timebasedadjustment=+20;
        }
        else if(showTime.equals("Late-Night")){
            timebasedadjustment=-20;
        }
        if(customerType.equals("Adult")){
            customerdiscount=0;
        }
        else if(customerType.equals("Senior")){
            customerdiscount=25;
        }
        else if(customerType.equals("Student")){
            customerdiscount=15;
        }
        else if(customerType.equals("Child")){
            customerdiscount=30;
        }
        double basewithSurcharge=baseTicketprice+formatsurcharge+seatupgradefee;
        double adjustedPrice=basewithSurcharge*(1+timebasedadjustment/100);
        double finalPrice=adjustedPrice*(1-customerdiscount/100);
        if (customerType.equals("Matinee shows")|| customerType.equals("Senior")||customerType.equals("Student")||customerType.equals("Child")){
            Concession="Yes";
        }
        if (finalPrice<10){
            pricingCategory="Value";
        } else if (finalPrice<20){
            pricingCategory="Standard";
        } else if (finalPrice<30){
            pricingCategory="Premium";
        } else{
            pricingCategory="Luxury";
        }
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + baseTicketprice);
        System.out.println("Format Surcharge: $" + formatsurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatupgradefee);
        System.out.println("Time-Based Adjustment: " + timebasedadjustment + "%");
        System.out.println("Customer Discount: " + customerdiscount + "%");
        System.out.println("Final Ticket Price: $" +finalPrice);
        System.out.println("Concession Voucher: " + Concession);
        System.out.println("Pricing Category: " + pricingCategory);

        scan.close();
    }
}

