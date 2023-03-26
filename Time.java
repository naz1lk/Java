package homeworks;

import java.util.Random;

public class Time {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(0,28800);
        int secondsInMinute = 60;
        int minutesInHour = 60;
        int secondsInHour = secondsInMinute * minutesInHour;
        int countHoursTillWorkDayOff = n / secondsInHour;
        int countMinutesTillWorkDayOff = n / secondsInMinute - countHoursTillWorkDayOff * minutesInHour;

        System.out.println("До конца рабочего дня осталось " + n + " секунд");
        System.out.println("До конца рабочего дня осталось " + countHoursTillWorkDayOff + " часов " + countMinutesTillWorkDayOff + " минут");
    }
}
