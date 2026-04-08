import java.util.Scanner;
public class Conditional4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int extra=sc.nextInt();
        sc.nextLine();
        String type=sc.nextLine();
        String eligibility="Not Eligible";
        String category="None";
        double amount=0;
        if(gpa>=2.5){
            
            if(type.equals("Merit")){
                if(gpa>=3.&&extra>=80){
                    eligibility="Eligible";
                    category="Full";
                    amount=25000;
                }
                else if(gpa>=3.5&&extra>=70){
                    eligibility="Eligible";
                    category="Partial";
                    amount=15000;
                }
                else if(gpa>=3.0&&extra>=60){
                    eligibility="Eligible";
                    category="Minimal";
                    amount=8000;
                }
            }
            else if(type.equals("Need-Based")) {

                if(income<= 30000&&gpa>=3.5){
                    eligibility="Eligible";
                    category="Full";
                    amount=30000;
                }
                else if(income<=50000&&gpa>=3.0){
                    eligibility="Eligible";
                    category="Partial";
                    amount=18000;
                }
                else if (income<=70000&&gpa>=2.8){
                    eligibility="Eligible";
                    category="Minimal";
                    amount=10000;
                }
            }
            else if (type.equals("Sports")){
                if (extra>=85&&gpa>=3.0) {
                    eligibility="Eligible";
                    category="Full";
                    amount=22000;
                }
                else if (extra>=75&&gpa>=2.8){
                    eligibility="Eligible";
                    category="Partial";
                    amount=20000;
                }
                else if (extra>=65&&gpa>=2.5){
                    eligibility="Eligible";
                    category="Minimal";
                    amount=12000;
                }
            }
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + extra);
        System.out.println("Scholarship Type: " + type);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + amount);
        System.out.println("Award Category: " + category);
        sc.close();
    }
}




