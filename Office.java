import java.util.Scanner;
public class Office {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int homesalary = a + b + c - d - e;
        System.out.println(homesalary);
    }
}