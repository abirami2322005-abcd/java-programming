import java.util.Scanner;
public class College{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int registration=scan.nextInt();
        int sponsorship=scan.nextInt();
        int stall=scan.nextInt();
        int stage=scan.nextInt();
        int celebrating=scan.nextInt();
        int marketing=scan.nextInt();
        int remainingfund=registration+sponsorship+stall-stage-celebrating-marketing;
        System.out.println("Remaining Fund="+remainingfund);
    }


}