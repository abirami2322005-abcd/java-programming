import java.util.Scanner;

public class Forloop14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double fine=0;
        double caps=0;
        double rates=0;
        int count=0;
        double average=0;
        int min=Math.min(fine, caps);
        for(int i=0;i<n;i++)
        {
            String bookType=sc.nextLine();
            int daysLate=sc.nextInt();
            if(bookType.equals("Regular"))
            {
                fine=0.50;
                caps=10;
            }
            else if(bookType.equals("Reference"))
            {
                fine=1.00;
                caps=20;
            }
            else if(bookType.equals("Magazine"))
            {
                fine=0.25;
                caps=5;
            }
            rates=daysLate*fine;
            if(daysLate>0)
            {
                count++;
            }
            average=fine/n;
            System.out.println("Book : "+bookType);
            System.out.println("Days late : "+daysLate);
            
        }
    }
}

