public class TimeDriver {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Hour: " + time1.getHour() + " Minute: " + time1.getMinute() + " Second: " + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println("Hour: " + time2.getHour() + " Minute: " + time2.getMinute() + " Second: " + time2.getSecond());
    }
    
}

class Time {
    private int hour;
    private int minute;
    private int second;
   
	
    Time() {
        long elapsedTime = System.currentTimeMillis();
        setAttributes(elapsedTime);
        
    }
    
    Time(long elapsedTime) {
        setAttributes(elapsedTime);
    }
    
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    
    public void setTime(long elapsedTime) {
        setAttributes(elapsedTime);
    }
    
    private void setAttributes(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        
        this.minute = (int)(totalMinutes % 60);
        this.second = (int)(totalSeconds % 60);
        this.hour = (int)(totalHours % 24);
    }
}

/*run:
Hour: 17 Minute: 3 Second: 17
Hour: 10 Minute: 19 Second: 10
BUILD SUCCESSFUL (total time: 0 seconds)*/
