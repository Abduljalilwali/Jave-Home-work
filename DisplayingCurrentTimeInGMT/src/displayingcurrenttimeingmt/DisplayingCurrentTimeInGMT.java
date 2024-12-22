
package displayingcurrenttimeingmt;

public class DisplayingCurrentTimeInGMT {

    public static void main(String[] args) {
       
        long totalMilliSeconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliSeconds/1000;
        long currentSeconds = totalSeconds%60;
        
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        
        long totalHour = totalMinutes/60;
        long currentHOur = totalHour%24;
        
        System.out.println("Current time is "+currentHOur+":"+currentMinutes+":"+currentSeconds+"GMT");
    }
    
}
