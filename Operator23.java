import java.util.Scanner;
public class Operator23 {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int resusaget=scan.nextInt();
        int resrate=scan.nextInt();
        int comusage=scan.nextInt();
        int comrate=scan.nextInt();
        int connection=scan.nextInt();
        int penality=scan.nextInt();
        int maintenance=scan.nextInt();
        int treatment=scan.nextInt();
        int netwaterrevenue=(resusaget*resrate)+(comusage*comrate)+connection+penality-maintenance-treatment;
        System.out.println(netwaterrevenue);
        scan.close();
    }
}
