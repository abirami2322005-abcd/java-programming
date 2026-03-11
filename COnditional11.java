import java.util.Scanner;
public class COnditional11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String studentStatus=scan.nextLine();
        int creditHours=scan.nextInt();
        scan.nextLine(); 
        String programType=scan.nextLine();
        String residency=scan.nextLine();
        double baseTuition=0;
        double residencyMultiplier = 1.0;
        double programFee = 0;
        double activityFee = 0;
        String category = "";
        if(programType.equals("Undergraduate")){
            baseTuition = 350;
        }
        else if(programType.equals("Graduate")){
            baseTuition = 550;
        }
        else if(programType.equals("Professional")){
            baseTuition = 800;
        }
        if(residency.equals("In-State")){
            residencyMultiplier = 1.0;
        }
        else if(residency.equals("Out-of-State")){
            residencyMultiplier = 2.5;
        }
        else if(residency.equals("International")){
            residencyMultiplier = 3.0;
        }
        if(studentStatus.equals("Full-Time")){
            if(programType.equals("Undergraduate")){
                programFee = 500;
            }
            else if(programType.equals("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 1200;
            }
            activityFee = 200;
        }
        else if(studentStatus.equals("Part-Time")){
            if(programType.equals("Undergraduate")){
                programFee = 300;
            }
            else if(programType.equals("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 900;
            }
            activityFee = 100;
        }
        else if(studentStatus.equals("Continuing-Education")){
            programFee = 150;
            activityFee = 50;
        }
        double tuitionCost = creditHours * baseTuition * residencyMultiplier;
        double totalFee = tuitionCost + programFee + activityFee;
        if(studentStatus.equals("Continuing-Education")){
            category = "Reduced";
        }
        else if(residency.equals("Out-of-State") || residency.equals("International")){
            category = "Premium";
        }
        else{
            category = "Standard";
        }
        System.out.println("Student Status: " + studentStatus);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Program Type: " + programType);
        System.out.println("Residency: " + residency);
        System.out.println("Base Tuition Per Credit: $" + baseTuition);
        System.out.println("Residency Multiplier: " + residencyMultiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + totalFee);
        System.out.println("Fee Category: " + category);
        scan.close();
    }
}
