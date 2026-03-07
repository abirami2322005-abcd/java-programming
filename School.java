import java.util.Scanner;
public class School{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int distance=scan.nextInt();
        int rate=scan.nextInt();
        int maintenance=scan.nextInt();
        int allowance=scan.nextInt();
        int subsidy=scan.nextInt();
        int totaltransport=(distance*rate)+allowance-subsidy+maintenance;
        System.out.println(totaltransport);
    }
}
