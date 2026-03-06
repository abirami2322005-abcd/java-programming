import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int tutionfees=scan.nextInt();
        int scholarship=scan.nextInt();
        int examfee=scan.nextInt();
        int libfee=scan.nextInt();
        int fee=tutionfees-(tutionfees*scholarship/100);
        int totalvalue=fee+examfee+libfee;
        System.out.println("TotalValue="+totalvalue);
    }
}
