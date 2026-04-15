import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int a=object.nextInt();
        int b=object.nextInt();
        int c=a/b;
        System.out.println(c);
        object.close();
    }
}