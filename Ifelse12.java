import java.util.Scanner;
public class Ifelse12 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int signal=sc.nextInt();
    int mask=sc.nextInt();

    int result=signal^mask;

    System.out.println("Toggled Signal = "+result);
    }
}
