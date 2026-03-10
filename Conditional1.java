import java.util.Scanner;
public class Conditional1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int credit=sc.nextInt();
        double income=sc.nextDouble();
        double ratio=sc.nextDouble();
        sc.nextLine();
        String type=sc.nextLine();
        String decision="Rejected";
        double maxLoan=0;
        if (credit<600||ratio>50) {
            decision="Rejected";
        } 
        else {
            if (type.equals("Home")) {
                if (credit>=750&&ratio<=30) {
                    decision="Approved";
                    maxLoan=income*4;
                } 
                else if (credit>=700&&ratio<=40) {
                    decision="Needs Review";
                    maxLoan=income*3;
                }
            } 
            else if (type.equals("Personal")) {
                if (credit>=750&&ratio<=30) {
                    decision="Approved";
                    maxLoan=income*1;
                } 
                else if (credit>=650&&ratio<=40) {
                    decision="Needs Review";
                    maxLoan=income*0.5;
                }
            } 
            else if (type.equals("Business")) {

                if (credit>=700&&ratio<=40) {
                    decision="Approved";
                    maxLoan=income*3;
                }
            }
        }
        System.out.println("Credit Score: " + credit);
        System.out.println("Annual Income: $" + income);
        System.out.println("Debt-to-Income Ratio: " + ratio + "%");
        System.out.println("Loan Type: " + type);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoan);
    }
}


