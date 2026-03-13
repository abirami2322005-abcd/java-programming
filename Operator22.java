import java.util.Scanner;
public class Operator22 {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int registriction=scan.nextInt();
        int broadcast=scan.nextInt();
        int sponsor=scan.nextInt();
        int prize=scan.nextInt();
        int rent=scan.nextInt();
        int advertisement=scan.nextInt();
        int tournamentfundremain=registriction+broadcast+sponsor-prize-rent-advertisement;
        System.out.println(tournamentfundremain);
        scan.close();
    }
}
