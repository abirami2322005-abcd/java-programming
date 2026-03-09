import java.util.Scanner;
public class Ifelse9 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int level=sc.nextInt();
    int capacity=base<<level;
    System.out.println("Total Capacity = "+capacity);
    }
}
