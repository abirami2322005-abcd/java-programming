import java.util.Scanner;

public class Forloop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int price=0;
        int discount=0;
        int individual=0;
        int total=0;
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            String seatType=sc.nextLine();
            String coustomerType=sc.nextLine();
            if(seatType.equals("Regular"))
            {
                price=12;
            }
            else if(seatType.equals("Premium"))
            {
                price=18;
            }
            else if(seatType.equals("Recliner"))
            {
                price=25;
            }
            if(coustomerType.equals("Adult"))
            {
                discount=0;
            }
            else if(coustomerType.equals("Child"))
            {
                discount=30;
            }
            else if(coustomerType.equals("Senior"))
            {
                discount=25;
            }
            individual=price*(1-discount/100);
            total=total+individual;
            System.out.println("Ticket : "+seatType);
            System.out.println("Coustomer type : "+coustomerType);
            System.out.println("Price : "+price);
            System.out.println("Discount : "+discount);
        }
        System.out.println("Total ticket : "+n);
        System.out.println("Original total : "+individual);
        System.out.println("Final total : "+total);
        if(n>=5)
        {
            System.out.println("Yes");
        }
        else 
            System.out.println("No");
    }
}
