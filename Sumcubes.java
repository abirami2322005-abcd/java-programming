public class Sumcubes {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println("Sum of cubes: " + sum);
    }
}
