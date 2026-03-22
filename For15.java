import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double basefare=3.00;
        double distancecharge=1.00;
        double surcharge=0;
        double total=0;
        double average=0;
        for(int i=0;i<n;i++)
        {
            double distance=sc.nextDouble();
            sc.nextLine();
            String timeofday=sc.nextLine();
            if(timeofday.equals("Morning"))
            {
                surcharge=0;
            }
            else if(timeofday.equals("Afternoon"))
            {
                surcharge=0;
            }
            else if(timeofday.equals("Evening"))
            {
                surcharge=3;
            }
            else if(timeofday.equals("Night"))
            {
                surcharge=5;
            }
            total=basefare+distancecharge+surcharge;
            average=total/n;
            System.out.println("Distance : "+distance);
            System.out.println("Time : "+timeofday);
            System.out.println("Base fare : "+basefare);
            System.out.println("Distaance charge : "+distancecharge);
            System.out.println("Time surcharge : "+surcharge);
            System.out.println("Total fare : "+total);
            System.out.println("Total surchagre  : "+average);
        }
    }
}
