import java.util.Scanner;
public class Forloop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        double totalOccupancyRate=0;
        int peakDay=0;
        double maxRate=0;
        int fullDays=0;

        for (int i=0;i<N;i++) {
            int day=sc.nextInt();
            int roomsOccupied=sc.nextInt();
            int totalRooms=sc.nextInt();

            double rate=((double)roomsOccupied/totalRooms)*100;

            String status;
            if (rate==100) {
                status="Full";
                fullDays++;
            } else if (rate>=80) {
                status="High";
            } else if (rate>=60) {
                status="Moderate";
            } else {
                status="Low";
            }

            totalOccupancyRate+=rate;

            if (rate>maxRate) {
                maxRate=rate;
                peakDay=day;
            }

            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + String.format("%.2f", rate) + "%");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double averageRate = totalOccupancyRate / N;

        System.out.println("Total Days Analyzed: " + N);
        System.out.println("Average Occupancy Rate: " + String.format("%.2f", averageRate) + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullDays);

        sc.close();
    }
}