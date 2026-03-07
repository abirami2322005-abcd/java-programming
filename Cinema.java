import java.util.Scanner;
public class Cinema{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int ticketrevenue=scan.nextInt();
        int snackrevenue=scan.nextInt();
        int maintenance=scan.nextInt();
        int electricity=scan.nextInt();
        int netprofit=ticketrevenue+snackrevenue-maintenance-electricity;
        System.out.println(netprofit);
    }
}
