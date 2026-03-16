import java.util.Scanner;
public class Operator12 {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int basesalary=scan.nextInt();
        int session=scan.nextInt();
        int paypersession=scan.nextInt();
        int bonus=scan.nextInt();
        int maintenance=scan.nextInt();
        int finalsalary=basesalary+(session*paypersession)+bonus-maintenance;
        System.out.println(finalsalary);
}

}
