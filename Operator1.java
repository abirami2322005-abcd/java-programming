import java.util.Scanner;
public class Operator1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        float Basecost=scan.nextFloat();
        int ExtraGB=scan.nextInt();
        float RateperGB=scan.nextFloat();
        float Tax=scan.nextFloat();
        float Totalbill=(Basecost+(ExtraGB*RateperGB))*(1+Tax/100);
        System.out.println("Totalbill="+Totalbill);
    }
}
