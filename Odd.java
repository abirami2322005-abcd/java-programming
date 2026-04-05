import java.util.Scanner;
public class Odd{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int[] arr = {1,2,3,4,5,6};

int even = 0, odd = 0;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] % 2 == 0)
        even++;
    else
        odd++;
}

System.out.println("Even = " + even);
System.out.println("Odd = " + odd);
scan.close();
    }
}