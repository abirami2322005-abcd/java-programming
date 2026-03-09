import java.util.Scanner;
public class Ifelse4 {
public static void main(String[] args){
Scanner scan=new Scanner(System.in);

int salary=scan.nextInt();
int score=scan.nextInt();

if(salary>25000 && score>700)
System.out.println("Loan Approved");
else
System.out.println("Loan Rejected");
}
}
