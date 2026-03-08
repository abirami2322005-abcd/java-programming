import java.util.Scanner;
public class Atm{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);

int balance=scan.nextInt();
int withdraw=scan.nextInt();
int limit=scan.nextInt();

if(withdraw<=balance && withdraw<=limit)
System.out.println("Transaction Approved");
else
System.out.println("Transaction Declined");
}
}


