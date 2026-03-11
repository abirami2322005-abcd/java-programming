import java.util.Scanner;
public class Conditional8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String locationTier=scan.nextLine();
        int squareFootage=scan.nextInt();
        int propertyAge=scan.nextInt();
        int amenityScore=scan.nextInt();
        double basePrice=0;
        int ageAdjustment;
        double amenityBonus=0;
        String marketCategory;
    
        if (locationTier.equals("Prime")){
            basePrice=400;
        }
        else if (locationTier.equals("Urban")){
            basePrice=300;
        }
        else if (locationTier.equals("Suburban")){
            basePrice=180;
        }
        else {
            basePrice=100;
        }
        double baseValue=squareFootage*basePrice;
        if (propertyAge<=5){
            ageAdjustment=0;
        }
        else if (propertyAge<=10){
            ageAdjustment=-5;
        }
        else if (propertyAge<=15){
            ageAdjustment=-10;
        }
        else if (propertyAge<30){
            ageAdjustment=-15;
        }
        else {
            ageAdjustment=-25;
        }
        double adjustValue=baseValue*(1+ageAdjustment/100);
        if (amenityScore>=80){
            amenityBonus=baseValue*0.10;
        }
        else if(amenityScore>=60){
            amenityBonus=baseValue*0.05;
        }
        else if(amenityScore>=40){
            amenityBonus=baseValue*0.02;
        }
        double finalValue=adjustValue+amenityBonus;
        if ((locationTier.equals("Prime")||locationTier.equals("Urban")&&propertyAge<15)){
            marketCategory="Hot";
        }
        else if (locationTier.equals("Suburban")){
            marketCategory="Stable";
        }
        else{
            marketCategory="Slow";      
        }
        System.out.println("Location Tier: "+ locationTier);
        System.out.println("Square Footage: "+ squareFootage+ "sq ft");
        System.out.println("Property Age: "+ propertyAge +"years");
        System.out.println("Amenity Score: "+ amenityScore);
        System.out.println("Basic price per Sq Ft:$"+basePrice);
        System.out.println("Age Adjustment: "+ageAdjustment+"%");
        System.out.println("Amenity Bonus: $"+amenityBonus);
        System.out.println("Estimated Property Value: $"+finalValue);
        System.out.println("Market Category: "+marketCategory);
    }

}
