import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int theory=scan.nextInt();
    int practical=scan.nextInt();
    double avg=(theory+practical)/2;
    if(theory>=50 && practical>=50 && avg>=60)
    System.out.println("Result = PASS");
    else
    System.out.println("Result = FAIL");
    scan.close();
    }
}
