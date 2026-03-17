import java.util.Scanner;
public class Forloop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        double totalSales=0;
        double totalCommissions=0;

        String topPerformer="";
        double highestSales=0;

        for (int i=0;i<N;i++) {
            String name=sc.next();
            double sales=sc.nextDouble();

            int rate=0;
            double bonus=0;
        
            if (sales<=40000) {
                rate=5;
            } else if (sales<=80000) {
                rate=8;
            } else if (sales<=100000) {
                rate=10;
            } else if (sales<=150000) {
                rate=12;
            } else {
                rate=15;
            }

            double commission=sales*rate/100;

            if (sales>=150000) {
                bonus=3000;
            } else if (sales>=100000) {
                bonus=2000;
            } else {
                bonus=0;
            }

            double totalPayout=commission+bonus;

            totalSales+=sales;
            totalCommissions+=commission;

            if (sales>highestSales) {
                highestSales=sales;
                topPerformer=name;
            }

            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + sales);
            System.out.println("Commission Rate: " + rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();
        }

        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);

        sc.close();
    }
}