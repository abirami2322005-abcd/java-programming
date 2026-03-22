import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int renewal=0;
        int bird=0;
        sc.nextLine();
        String priority=" ";
        int count=0;
        int finalfee=0;
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            String memberName=sc.nextLine();
            String membertype=sc.nextLine();
            int dayuntil=sc.nextInt();
            if(membertype.equals("Basic"))
            {
                renewal=50;
            }
            else if(membertype.equals("Premium"))
            {
                renewal=100;
            }
            else if(membertype.equals("VIP"))
            {
                renewal=200;
            }
            if(dayuntil>=45)
            {
                bird=20;
            }
            else if(dayuntil>=30 && dayuntil<=44)
            {
                bird=15;
            }
            else if(dayuntil>=15 && dayuntil<=29)
            {
                bird=10;
            }
            else if(dayuntil<15)
            {
                bird=0;
            }
            if(dayuntil<10)
            {
                priority="Urgent";
                count++;
            }
            else if(dayuntil>=10 && dayuntil<=30)
            {
                priority="High";
            }
            else if(dayuntil>30)
            {
                priority="Normal";
            }
            finalfee=renewal*(1-bird/100);
            System.out.println("Member name : "+memberName);
            System.out.println("Membership : "+membertype);
            System.out.println("Day until expiry : "+dayuntil);
            System.out.println("Renewal fee : "+renewal);
            System.out.println("Discount : "+bird);
            System.out.println("Final fee : "+finalfee);
            System.out.println("Priority : "+priority);
            System.out.println("Total memeber : "+n);
            System.out.println("total rewewal : "+finalfee);
            

        }
    }
}
