import java.util.Scanner;
public class Ifelse5 {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int cart=scan.nextInt();
int premium=scan.nextInt();

if(cart>999 || premium==1)
System.out.println("Free Shipping");
else
System.out.println("Shipping Charges Applied");
}
}
