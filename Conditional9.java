import java.util.Scanner;
public class Conditional9{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String timeOfDay=scan.nextLine();
        double powerConsumption=scan.nextDouble();
        double renewablePercentage=scan.nextDouble();
        scan.nextLine();
        String rateTier=scan.nextLine();
        double baseRate=0.0;
        double multiplier=0.0;
        if(rateTier.equals("Basic"))
            baseRate=0.18;
        else if(rateTier.equals("Time-of-Use"))
            baseRate=0.15;
        else if(rateTier.equals("Premium-Green"))
            baseRate=0.12;
        if(timeOfDay.equals("Peak")){
            if(rateTier.equals("Time-of-Use"))
                multiplier=1.8;
            else
                multiplier=1.5;
        } else if(timeOfDay.equals("Off-Peak")){
            if(rateTier.equals("Time-of-Use"))
                multiplier=0.8;
            else
                multiplier=1.0;
        } else if(timeOfDay.equals("Super-Off-Peak")){
            if(rateTier.equals("Premium-Green"))
                multiplier=0.6;
            else
                multiplier=0.5;
        }
        double renewableCredit=(powerConsumption*renewablePercentage/100)*baseRate;
        double totalCost=(powerConsumption*baseRate*multiplier)-renewableCredit;
        if(totalCost<0)
            totalCost=0;
        String recommendation=" ";
        double savings=0;
        if(timeOfDay.equals("Peak")&&renewablePercentage<30){
            recommendation="Shift high-power appliances to Off-Peak hours";
            savings=powerConsumption*baseRate;
        }
        else if(renewablePercentage>50){
            recommendation="Excellent! Maximize appliance use during this period";
        }
        else if(rateTier.equals("Basic")){
            recommendation="Consider upgrading to Time-of-Use plan";
            savings=0.75;
        }
        else{
            recommendation="Good timing! Consider increasing renewable capacity";
        }
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" + renewableCredit);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + savings);
        scan.close();
    }
}

