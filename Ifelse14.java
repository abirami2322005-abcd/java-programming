import java.util.Scanner;
public class Ifelse14 {
   public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   int income=scan.nextInt();
   int percent=scan.nextInt();
   if(income<200000 && percent>=75)
   System.out.println("Scholarship Granted");
   else
   System.out.println("Not Granted");
   } 
}
