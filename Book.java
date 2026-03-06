import java.util.Scanner;
public class Book{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int copies=scan.nextInt();
        int cost=scan.nextInt();
        int editing=scan.nextInt();
        int design=scan.nextInt();
        int commission=scan.nextInt();
        int marketing=scan.nextInt();
        int publishingprofit=(copies*cost)+editing
+design-commission-marketing;        
        System.out.println(publishingprofit);
    }
}