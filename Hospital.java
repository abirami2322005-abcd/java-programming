import java.util.Scanner;
public class Hospital{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int roomcharge=scan.nextInt();
        int days=scan.nextInt();
        int medicinecost=scan.nextInt();
        int labfees=scan.nextInt();
        int insurancecoverage=scan.nextInt();
        int payableamount=(roomcharge*days)+medicinecost+labfees-insurancecoverage;
        System.out.println("Payableamount="+payableamount);
   }
}