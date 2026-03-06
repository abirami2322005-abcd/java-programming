import java.util.Scanner;
class Sales{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int sales=scan.nextInt();
        int discount=scan.nextInt();
        int gst=scan.nextInt();
        int afterDiscount=sales-(sales*discount/100);
        int revenue=afterDiscount+(afterDiscount*gst/100);
        System.out.println("Final Revenue="+revenue);
    }
}
