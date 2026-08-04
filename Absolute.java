import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int evensum=0,oddsum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                evensum=evensum+a[i];
            }
            else{
                oddsum=oddsum+a[i];
            }
        }
        if(oddsum>evensum){
            System.out.println(oddsum-evensum);
        }
        else{
            System.out.println(evensum-oddsum);
        }
    }
}
