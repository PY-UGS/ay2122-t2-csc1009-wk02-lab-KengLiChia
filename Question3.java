public class Question3 {
    public static void main(String[] args) {
        long totalMilliseconds =System.currentTimeMillis();

        long totalSeconds =totalMilliseconds / 1000;
        long currentSeconds =totalSeconds%60;

        long totalMinutes = totalSeconds/60 + (8*60); //SG GMT +8
        long currentMinutes= totalMinutes%60;

        long totalHours= totalMinutes/60;
        long currentHours= totalHours%24;

        System.out.println("Current time is " + currentHours + ":" +currentMinutes + ":" + currentSeconds + " GMT");
    }
}
