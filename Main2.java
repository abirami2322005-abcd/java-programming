import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        int square = (int) Math.pow(num, 2);


        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        
        int power = (int) Math.pow(10, digits);

        
        if (square % power == num) {
            System.out.println("Astronaut Number");
        } else {
            System.out.println("Not an Astronaut Number");
        }
    }
}