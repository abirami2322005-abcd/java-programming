import java.util.Scanner;
public class Conditional7{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int heartRate=scan.nextInt();
        scan.nextLine();
        String bloodPressure=scan.nextLine();
        double temperature=scan.nextDouble();
        scan.nextLine();
        String severity=scan.nextLine();
        String[] bp=bloodPressure.split("/");
        int systolic=Integer.parseInt(bp[0]);
        int diastolic=Integer.parseInt(bp[1]);
        String priority="";
        int waitTime=0;
        String action="";
        if (heartRate<50||heartRate>130||systolic>180||systolic < 90||temperature>103||temperature<96||
            severity.equals("Life-Threatening")) {
            priority="Critical";
            waitTime=0;
            action="Immediate Emergency Care";
        }
        else if ((heartRate>=50&&heartRate<=60)||(heartRate>=110&&heartRate<=130)||(systolic>=160&&systolic<=180)||(systolic>=90&&systolic<=100)||(temperature>=101&&temperature<=103)||(temperature>=96&&temperature<=97)||
                 severity.equals("Severe")){

            priority="Urgent";
            if (heartRate>=50&&heartRate<=60)
                waitTime=20;
            else
                waitTime=15;
            action="Priority Medical Attention";
        }
        else if (severity.equals("Moderate")) {
            priority="Standard";
            waitTime=45;
            action="Standard Examination";
        }
        else {
            priority="Non-Urgent";
            waitTime=90;
            action="Routine Check-up";
        }
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}