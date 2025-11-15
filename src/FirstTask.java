import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        String resultMinutes,resultHours;
        int totalRideHours, totalRideMinutes;

        Scanner scanner = new Scanner(System.in);

        String startTime = scanner.nextLine();
        String finishTime = scanner.nextLine();
        int time = Integer.parseInt(scanner.nextLine());

        scanner.close();

        int startHours = Integer.parseInt(startTime.substring(0, 2));
        int startMinutes = Integer.parseInt(startTime.substring(3, 5));

        int finishHours = Integer.parseInt(finishTime.substring(0, 2));
        int finishMinutes = Integer.parseInt(finishTime.substring(3, 5));

        int hours = time / 60;
        int minutes = time % 60;

        System.out.println( hours + " часов " + minutes + " минут - в пути");

        if(finishMinutes < startMinutes){
            totalRideMinutes = finishMinutes + 60 - startMinutes;
            totalRideHours = finishHours - 1 - startHours;
        }
        else{
            totalRideMinutes = finishMinutes - startMinutes;
            totalRideHours = finishHours - startHours;
        }
        if (totalRideHours < 0){
            totalRideHours += 24;
        }

        System.out.println(totalRideHours + " часов " + totalRideMinutes + " минут - общее время");

        int stopHours = totalRideHours - hours;
        int stopMinutes = totalRideMinutes - minutes;

        if (stopMinutes < 10){
            resultMinutes = "0" + Integer.toString(stopMinutes);
        }
        else{
            resultMinutes = Integer.toString(stopMinutes);
        }

        if (stopHours < 10){
            resultHours = "0" + Integer.toString(stopHours);
        }
        else{
            resultHours = Integer.toString(stopHours);
        }

        System.out.println( "время стоянки: " + resultHours + ":" + resultMinutes);
    }
}
