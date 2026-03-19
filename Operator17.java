import java.util.Scanner;
public class Operator17 {
        public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int days=scan.nextInt();
        int rent=scan.nextInt();
        int late=scan.nextInt();
        int fuel=scan.nextInt();
        int maintenance=scan.nextInt();
        int netprofit=(rent*days)+late-fuel-maintenance;
        System.out.println(netprofit);
    }
}
