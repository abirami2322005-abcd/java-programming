import java.util.Scanner;
public class Rev {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int arr[]={1,2,3,4,5};
       for (int i=arr.length-1; i>=0;i--){
        System.out.print(arr[i]+" ");
       }
       scan.close();
   } 
}
