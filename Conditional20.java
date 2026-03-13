import java.util.Scanner;
public class Conditional20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String locationZone=scan.nextLine();
        double parkingHours=scan.nextDouble();
        scan.nextLine();
        String vechicleType=scan.nextLine();
        
        String membership=scan.nextLine();


        double baseHourlyrate=5.00;
        int zonePremieum=0;
        double vechiclesize=0;
        double membershipdiscount=0;
        double dailycap=0;
        String dailycapapplied="No";
        String ratecategory="";

        if(locationZone.equals("Downtown")){
            zonePremieum=50;
            dailycap=150;
            ratecategory="Premieum";
        }
        else if(locationZone.equals("Business-District")){
            zonePremieum=30;
            dailycap=120;
            ratecategory="Premieum";
        }
        else if(locationZone.equals("Residential")){
            zonePremieum=0;
            dailycap=60;
            ratecategory="Standard";
        }
        else if(locationZone.equals("Airport")){
            zonePremieum=100;
            dailycap=180;
            ratecategory="Luxury";
        }
        if(vechicleType.equals("Motorccycle")){
            vechiclesize=-2;
        }
        else if(vechicleType.equals("Compact")){
            vechiclesize=0;
        }
        else if(vechicleType.equals("Sedan")){
            vechiclesize=0;
        }
        else if(vechicleType.equals("SUV")){
            vechiclesize=3;
        }
        else if(vechicleType.equals("Oveersized")){
            vechiclesize=5;
        }
        
        if(membership.equals("None")){
            membershipdiscount=0;
        }
        else if(membership.equals("Monthly")){
            membershipdiscount=20;
        }
        else if(membership.equals("Annual")){
            membershipdiscount=25;
        }
        else if(membership.equals("VIP")){
            membershipdiscount=30;
        }
        
        double Hourly=baseHourlyrate*(1+zonePremieum/100)+vechiclesize;
        double calcilatedfee=Hourly*parkingHours;
        double finalfee=calcilatedfee*(1-membershipdiscount/100);
        if(parkingHours>=24){
            dailycapapplied="Yes";
            if(finalfee>dailycap){
                finalfee=dailycap;
            }
        }
        System.out.println("Location Zone: "+locationZone);
        System.out.println("Parking Duration: "+parkingHours);
        System.out.println("vechicle Type: "+vechicleType);
        System.out.println("Membership Status: "+membership);
        System.out.println("Base Hourly Rate: $"+baseHourlyrate+"%");
        System.out.println("Zone Premieum: "+zonePremieum);
        System.out.println("Vechicle Size Surcharge: $"+vechiclesize);
        System.out.println("Membership Discount: "+membershipdiscount+"%");
        System.out.println("Total Parking Fee: $"+finalfee);
        System.out.println("Daily Cap Applied: "+dailycapapplied);
        System.out.println("Rate Categorgy: "+ratecategory);
        scan.close();
    }
}
