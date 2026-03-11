import java.util.Scanner;
public class Conditional6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double annualRevenue=scan.nextDouble();
        scan.nextLine();
        String businessType=scan.nextLine();
        double deductibleExpenses=scan.nextDouble();
        double taxCredits=scan.nextDouble();
        double taxIncome=annualRevenue-deductibleExpenses;
        int Taxrate=0;
        if(businessType.equals("C-Corp")){
            if(taxIncome<500000)
                Taxrate=21;
            else if(taxIncome<1000000)
                Taxrate=24;
            else if(taxIncome<2000000)
                Taxrate=28;
            else 
                Taxrate=30;
        }
        else if(businessType.equals("S-Crop")){
            if(taxIncome<500000)
                Taxrate=20;
            else if(taxIncome<1000000)
                Taxrate=25;
            else 
                Taxrate=28;
        }
        else if(businessType.equals("LLC")){
            if(taxIncome<=20000)
                Taxrate=15;
            else if(taxIncome<=500000)
                Taxrate=18;
            else 
                Taxrate=22;
        }
        else if(businessType.equals("Partnership")){
            if(taxIncome<300000)
                Taxrate=18;
            else if(taxIncome<=800000)
                Taxrate=2;
            else 
                Taxrate=26;
        }
        double grosstax=taxIncome*Taxrate/100;
         double nettaxaftercredits=grosstax-taxCredits;
        if (nettaxaftercredits<0)
            nettaxaftercredits=0;

        double effectiverate=(nettaxaftercredits/annualRevenue)*100;
        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + deductibleExpenses);
        System.out.println("Tax Credits: $" + taxCredits);
        System.out.println("Taxable Income: $" + taxIncome);
        System.out.println("Tax Rate: " + Taxrate + "%");
        System.out.println("Gross Tax: $" + grosstax);
        System.out.println("Net Tax After Credits: $" + nettaxaftercredits);
        System.out.println("Effective Tax Rate: " + String.format("%.2f", effectiverate) + "%");

    }
    
}
