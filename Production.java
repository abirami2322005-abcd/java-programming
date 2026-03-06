import java.util.Scanner;
public class Production{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int rodsperhour=scan.nextInt();
        int hoursworked=scan.nextInt();
        int overtimerods=scan.nextInt();
        int rejectedrods=scan.nextInt();
        int finalproduction=(rodsperhour*hoursworked)+overtimerods-rejectedrods;
        System.out.println("Finalproduction="+finalproduction);
    }
}
