/*
This class convert's the user's time input to a char array and stores it for computation.
 */

public class Time {

    private int hour;
    private double min;//(Minutes will be stored as decimal percentage of hour)
    private String amOrPm = "AM";

    //Constructor//
    public Time (int h, double m, String aP) {
        this.hour = h; this.min = (m/60); this.amOrPm = aP;
    }

    //Setters//

    //Set hour method
    public void setHour(int h) {
        this.hour += h;
    }

    //Set min method
    public void setMin(double m) {
        this.min += m;
    }

    //Set AM or PM method
    public void setAmOrPm(String aP) {
        if (this.amOrPm == aP) {
            //I need to finish this <----------------------------------------- This is where I left off
        }
        this.amOrPm = aP;
    }


    //Getters//

    //Get hour method
    public int getHour() {
        return hour;
    }

    //Get min method
    public double getMin() {
        return min;
    }

    //Get hour method
    public String getAmOrPM() {
        return amOrPm;
    }


    //To String//
    public String toString() {
       String time;
       String minute;

       //if time is 0 we need a double 0
       if (this.min == 0)
           minute = "00";

       //if less than 10 on hour then add a leading zero to minutes
       else if (this.min*60 < 10)
           minute = "0"+String.valueOf(Math.round(min*60));

       else
           minute = String.valueOf(Math.round(min*60));

       //Put Hour + minute + AM/PM together into the variable "time"
       time = String.valueOf(hour)+":"+minute+" "+amOrPm;

       return time;
    }



}
