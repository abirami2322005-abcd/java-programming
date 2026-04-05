import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int [] arr={10,20,30,40};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        scan.close();
    }
}
