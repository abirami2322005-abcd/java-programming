import java.util.Scanner;
public class Conditional2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the status: ");
        String status=scan.nextLine();
        scan.nextLine();
        System.out.println("Enter the condition: ");
        String condition=scan.nextLine();
        scan.nextLine();
        System.out.println("Enter the coverage: ");
        String coverage=scan.nextLine();
        double base=0;
        double risk=0;
        if(coverage.equals("Basic")){
            if(age>=18&&age<=30)
                base=200;
            else if(age<=50)
                base=250;
            else if(age<=65)
                base=350;
            else 
                base=400;
        }
        else if(coverage.equals("Standard")){
            if(age>=18&&age<=30)
                base=300;
            else if(age<=50)
                base=350;
            else if(age<=65)
                base=450;
            else 
                base=550;
        }
        else if(coverage.equals("Premieum")){
            if(age>=18&&age<=30)
                base=500;
            else if(age<=50)
                base=600;
            else if(age<=65)
                base=700;
            else 
                base=800;
        }
        if(status.equals("Smoker")&&condition.equals("Yes")){
            risk=base*0.70;
        }
        else if(status.equals("Smoker")){
            risk=base*0.40;
        }
        else if(condition.equals("Yes")){
            risk=base*0.30;
        }
        double totalpremieum=base+risk;
        System.out.println("Age: "+age);
        System.out.println("Status: "+status);
        System.out.println("Condition: "+condition);
        System.out.println("Coverage: "+coverage);
        System.out.println("Base:$ "+base);
        System.out.println("Risk:$ "+risk);
        System.out.println("Total Premieum:$ "+totalpremieum);
    }
    
}
