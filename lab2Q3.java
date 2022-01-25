package lab2;

//import java.lang.

public class lab2Q3 {
    
    public static void main(String args[]){

        long totalMilliseconds = System.currentTimeMillis();

        System.out.print("The total time elapsed in milliseconds since midnight, January 1, 1970 is: " + totalMilliseconds);

        long totalSeconds = totalMilliseconds / 1000;

        System.out.print("\n\nThe total time elapsed in seconds since midnight, January 1, 1970 is: " + totalSeconds);   
        
        long currentSecond = totalSeconds % 60;

        System.out.print("\n\nThe current second is: " + currentSecond);   

        long totalMinutes =  totalSeconds / 60;

        System.out.print("\n\nThe total time elapsed in minutes since midnight, January 1, 1970 is: " + totalMinutes);  
        
        long currentMinute = totalMinutes % 60;

        System.out.print("\n\nThe current minute is: " + currentMinute);  

        long totalHours = totalMinutes / 60;

        System.out.print("\n\nThe total time elapsed in hours since midnight, January 1, 1970 is: " + totalHours);  

        long currentHour = totalHours % 24;

        System.out.print("\n\nThe current hour is: " + currentHour);   
        
        System.out.print("\n\nCurrent time is " + currentHour + ":" + currentMinute + ":" + currentSecond +" GMT");


    }
}
