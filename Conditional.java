import java.util.Scanner;
public class Conditional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rating=sc.nextInt();
        int years=sc.nextInt();
        sc.nextLine();
        String dept=sc.nextLine();
        double salary=sc.nextDouble();
        int bonusPercent=0;
        String status="Not Eligible";
        if (rating>=3) {
            if (dept.equals("Critical")) {
                if (rating==5&&years>=5)
                    bonusPercent=25;
                else if(rating==4&&years>=10)
                    bonusPercent=22;
                else if(rating==4)
                    bonusPercent=15;
                else if(rating==3)
                    bonusPercent=10;

            } else if(dept.equals("Non-Critical")){
                if (rating==5)
                    bonusPercent=18;
                else if (rating==4)
                    bonusPercent=12;
                else if (rating==3)
                    bonusPercent=8;
            }
            if (bonusPercent>0)
                status="Eligible";
        }
        double bonusAmount = salary*bonusPercent/100;
        System.out.println("Performance Rating: " +rating);
        System.out.println("Years of Service: " + years);
        System.out.println("Department: " + dept);
        System.out.println("Bonus Percentage: " + bonusPercent + "%");
        System.out.println("Bonus Amount:$ " + bonusAmount);
        System.out.println("Status: " + status);
        sc.close();
    }
}


