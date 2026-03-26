import java.util.Scanner;
public class Ifelse1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int balance=sc.nextInt();
    int withdraw=sc.nextInt();
    int limit=sc.nextInt();
    if(withdraw<=balance && withdraw<=limit){
    System.out.println("Transaction Approved");
    }
    else{
    System.out.println("Transaction Declined");
    }
    sc.close();
    }
}
