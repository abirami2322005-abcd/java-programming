import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double temp;
        int hour;
        double totalTemp=0;
        double highestTemp=-1000;
        double lowestTemp=1000;
        int highestHour=0;
        int lowestHour=0;
        int hotCount=0;
        int coldCount=0;
        for (int i=0;i<n;i++) {
            hour=sc.nextInt();
            temp=sc.nextDouble();
            System.out.println("Hour " + hour + ": " + temp + "°C");
            String status;
            if (temp > 40 || temp < 0) {
                status="Extreme";
            } 
            else if (temp >= 32 && temp <= 40) {
                status="Hot";
            } 
            else if (temp >= 0 && temp <= 10) {
                status="Cold";
            } 
            else {
                status="Normal";
            }
            System.out.println("Status: " + status);
            System.out.println();
            if (temp >= 32) {
                hotCount++;
            }
            if (temp <= 10 && temp >= 0) {
                coldCount++;
            }
            if (temp > highestTemp) {
                highestTemp=temp;
                highestHour=hour;
            }
            if (temp < lowestTemp) {
                lowestTemp=temp;
                lowestHour=hour;
            }
            totalTemp=totalTemp+temp;
        }
        double average=totalTemp/n;
        System.out.println("Total Readings: " + n);
        System.out.printf("Average Temperature: %.2f°C\n", average);
        System.out.println("Highest Temperature: " + highestTemp + "°C at Hour " + highestHour);
        System.out.println("Lowest Temperature: " + lowestTemp + "°C at Hour " + lowestHour);
        System.out.println("Hot Hours: " + hotCount);
        System.out.println("Cold Hours: " + coldCount);
    }
}