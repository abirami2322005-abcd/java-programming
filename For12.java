import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int rates=0;
            int cap=0;
            int fee=0;
            int count=0;
            int total=0;
            int average=0;
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            String vehicleType=sc.nextLine();
            int hoursParked=sc.nextInt();
            if(vehicleType.equals("Car"))
            {
                rates=3;
                cap=30;
            }
            else if(vehicleType.equals("Motorcycle"))
            {
                rates=2;
                cap=20;
            }
            else if(vehicleType.equals("Truck"))
            {
                rates=5;
                cap=60;
            }
            else if(vehicleType.equals("Bus"))
            {
                rates=7;
                cap=100;
            }
            fee=hoursParked*rates;
            if(hoursParked>8)
            {
                count++;
            }
            total=total+rates;
            average=total/n;
            System.out.println("Vehicle : "+vehicleType);
            System.out.println("Hour Parked : "+hoursParked);
        }
        System.out.println("Hourly rate : "+rates);
        System.out.println("Parking fee : "+ fee);
        System.out.println("Total vehicle : "+n);
        System.out.println("Total revenue : "+total);
        System.out.println("Average fee : "+average);
        System.out.println("Peak hour vehicle : "+count);
        }
    }

