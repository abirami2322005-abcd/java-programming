import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;

        int digits = String.valueOf(num).length();
        int power = (int) Math.pow(10, digits);

        int lastPart = square % power;
        int firstPart = square / power;

        if (lastPart + firstPart == num) {
            System.out.println("Astronaut Number");
        } else {
            System.out.println("Not an Astronaut Number");
        }
    }
}