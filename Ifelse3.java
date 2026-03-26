import java.util.Scanner;
public class Ifelse3 {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int limit=scan.nextInt();
int purchase=scan.nextInt();
int blocked=scan.nextInt();
if(purchase<=limit && blocked==0)
System.out.println("Approved");
else
System.out.println("Declined");
}
}
