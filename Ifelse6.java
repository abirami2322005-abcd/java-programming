import java.util.Scanner;
public class Ifelse6 {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int user=scan.nextInt();
    int pass=scan.nextInt();
    int locked=scan.nextInt();
    if(user==1 && pass==1 && locked!=1)
    System.out.println("Login Success");
    else
    System.out.println("Login Failed");
    }
}
