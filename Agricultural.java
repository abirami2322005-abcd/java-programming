import java.util.Scanner;
public class Agricultural{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int yieldperacre=scan.nextInt();
        int acres=scan.nextInt();
        int extrayeild=scan.nextInt();
        int damagedcrops=scan.nextInt();
        int marketableyeild=(yieldperacre*acres)+extrayeild-damagedcrops;
        System.out.println(marketableyeild);
    }
}