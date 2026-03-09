import java.util.Scanner;
public class Ifelse13 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int size=sc.nextInt();
int cycle=sc.nextInt();

int result=size>>cycle;

System.out.println("Compressed Size = "+result);
}
}
