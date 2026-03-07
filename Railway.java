import java.util.Scanner;
public class Railway{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int genfare=scan.nextInt();
        int genpass=scan.nextInt();
        int acpass=scan.nextInt();
        int acfare=scan.nextInt();
        int platform=scan.nextInt();
        int maintenance=scan.nextInt();
        int fuel=scan.nextInt();
        int railwayrevenue=(genfare*genpass)+(acfare*acpass)
+platform-maintenance-fuel;
System.out.println("Railwayrevenue="+railwayrevenue);
    }
}