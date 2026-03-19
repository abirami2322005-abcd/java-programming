import java.util.Scanner;
public class Operator18 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int ads=scan.nextInt();
    int sponsor=scan.nextInt();
    int affiliate=scan.nextInt();
    int tax=scan.nextInt();
    int production=scan.nextInt();
    int finalyoutubeincome=sponsor+ads+affiliate-tax-production;
    System.out.println(finalyoutubeincome);
    }
}
