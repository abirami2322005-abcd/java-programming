import java.util.Scanner;
public class Ifelse7 {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int age=scan.nextInt();
    int id=scan.nextInt();
    if(age>=18 && id==1)
    System.out.println("Entry Allowed");
    else
    System.out.println("Entry Denied");
    }
}
