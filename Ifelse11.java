import java.util.Scanner;
public class Ifelse11 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int value=sc.nextInt();
    int mask=sc.nextInt();

    if((value & mask) > 0)
    System.out.println("Appliance Active");
    else
    System.out.println("Inactive");
    }
}
