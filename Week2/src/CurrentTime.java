public class CurrentTime {
    public static void main(String[] args){
        long totalMillSeconds = System.currentTimeMillis();
        System.out.println(totalMillSeconds);
        long totalSeconds = totalMillSeconds/1000;
        long seconds = totalSeconds % 60;
        System.out.println(totalSeconds);
        long totalMinutes = totalSeconds / 60;
        System.out.println(totalMinutes);
        long minutes = totalMinutes % 60;
        long Hours = totalMinutes / 60 % 24;
        System.out.println("Current hour is " + Hours +": "+ minutes+":" + seconds);
    }
}
