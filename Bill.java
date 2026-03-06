import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int totalbill=scan.nextInt();
        int service=scan.nextInt();
        int gst=scan.nextInt();
        int numofpeople=scan.nextInt();
        int ser=totalbill+(totalbill*service/100);
        int total=ser+(ser*gst/100);
        int amountperperson=total/numofpeople;
        System.out.println("Amountperperson="+amountperperson);
    }
}
