import java.util.Scanner;
public class Employee{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);

int hours=scan.nextInt();
int attendance=scan.nextInt();

if(hours>40 && attendance>90)
System.out.println("Bonus Eligible");
else
System.out.println("Not Eligible");
}
}
