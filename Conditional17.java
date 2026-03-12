import java.util.Scanner;
public class Conditional17 {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       double packageWeight=scan.nextDouble();
       scan.nextLine();
       String destinationZone=scan.nextLine();
       String shippingSpeed=scan.nextLine();
       String packageSize=scan.nextLine();

       double baseShippingRate=0;
       double Weight=packageWeight*1;
       double Zonemultipiler=0;
       double Size=0;
       int estimateddays=0;
       String service="";
    if(shippingSpeed.equals("Economy")){
        baseShippingRate=5;
    }
    else if(shippingSpeed.equals("Standard")){
        baseShippingRate=10;
    }
    else if(shippingSpeed.equals("Express")){
        baseShippingRate=25;
    }
    else if(shippingSpeed.equals("Overnight")){
        baseShippingRate=50;
    }
    if(destinationZone.equals("Local")){
        Zonemultipiler=1.0;
    }
    else if(destinationZone.equals("Regional")){
        Zonemultipiler=1.2;
    }
    else if(destinationZone.equals("National")){
        Zonemultipiler=1.5;
    }
    else if(destinationZone.equals("International")){
        Zonemultipiler=3.0;
    }
    if(packageSize.equals("Small")){
        Size=0;
    }
    else if(packageSize.equals("Medium")){
        Size=5;
    }
    else if(packageSize.equals("Oversized")){
        Size=30;
    }
    double basecost=(baseShippingRate+Weight)*Zonemultipiler;
    double totalcost=(basecost+Size);
    if(shippingSpeed.equals("Local")){
        estimateddays=3;
    }
    else if(shippingSpeed.equals("Regional")){
        estimateddays=7;
    }
    else if(shippingSpeed.equals("National")){
        estimateddays=7;
    }
    else if(shippingSpeed.equals("International")){
        estimateddays=21;
    }
    if(destinationZone.equals("Local")){
        estimateddays=2;
    }
    else if(destinationZone.equals("Regional")){
        estimateddays=3;
    }
    else if(destinationZone.equals("National")){
        estimateddays=5;
    }
    else if(destinationZone.equals("International")){
        estimateddays=14;
    }
    if(shippingSpeed.equals("Local")){
        estimateddays=1;
    }
    else if(shippingSpeed.equals("Regional")){
        estimateddays=2;
    }
    else if(shippingSpeed.equals("National")){
        estimateddays=3;
    }
    else if(shippingSpeed.equals("International")){
        estimateddays=5;
    }
    else if(shippingSpeed.equals("Overnight")){
        estimateddays=1;
    }
    if(shippingSpeed.equals("Economy")){
        service="Budget";
    }
    else if(shippingSpeed.equals("Standard")){
        service="Standard";
    }
    else if(shippingSpeed.equals("Express")){
        service="Priority";
    }
    else if(shippingSpeed.equals("Overnight")){
        service="Premium";
    }
    System.out.println("Package Weight: "+packageWeight+"lbs");
    System.out.println("Destination Zone: "+destinationZone);
    System.out.println("Shipping Speed: "+shippingSpeed);
    System.out.println("Package Size: "+packageSize);
    System.out.println("Base Shippin Rate: $"+baseShippingRate);
    System.out.println("Weight Surcharge: $"+Weight);
    System.out.println("Zone Multiplier: "+Zonemultipiler+"x");
    System.out.println("Size Surcharge: $"+Size);
    System.out.println("Total Shipping Cost: $"+totalcost);
    System.out.println("Estimated Delivery: "+estimateddays+"bussiness days");
    System.out.println("Service Level: "+service);
    scan.close();
   } 
}
