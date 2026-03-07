import java.util.Scanner;
public class Hotel{
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        int rooms=scan.nextInt();
        int price=scan.nextInt();
        int servicecharges=scan.nextInt();
        int commission=scan.nextInt();
        int totalrevenue=(rooms*price)+servicecharges-commission;
        System.out.println(totalrevenue);
    }
}
