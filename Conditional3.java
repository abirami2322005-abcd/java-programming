import java.util.Scanner;
public class Conditional3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         String tier=scan.nextLine();
        double cart=scan.nextDouble();
        scan.nextLine();
        String category=scan.nextLine();
        String member=scan.nextLine();
        int base=0;
        int extra=0;

        if (tier.equals("Bronze")){ 
            base=5;
        }
        else if (tier.equals("Silver")){ 
            base=8;
        }
        else if (tier.equals("Gold")){
             base=12;
        }
        else if (tier.equals("Platinum")){
            base=15;
        }
        if (cart>=500&&cart<=999){
            extra+=3;
        }
        else if (cart>=1000&&cart<=1999){
             extra+=5;
        }
        else if (cart>=2000){ 
            extra+=7;
        }
        if (category.equals("Electronics")&&member.equals("Prime")){
            extra+=5;
        }
        else if (category.equals("Fashion")){
            extra+=3;
        }
        else if (category.equals("Books")&&member.equals("Prime")){
            extra+=5;
        }
        else if (category.equals("Groceries")&&cart>300){
            extra+=2;
        }
        int totalDiscount=base+extra;
        double finalPrice=cart*(1-totalDiscount/100.0);
        double savings=cart-finalPrice;
        System.out.println("Loyalty Tier: " + tier);
        System.out.println("Cart Value: $" + cart);
        System.out.println("Product Category: " + category);
        System.out.println("Membership: " + member);
        System.out.println("Base Discount: " + base + "%");
        System.out.println("Additional Discount: " + extra + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);
    }
}



