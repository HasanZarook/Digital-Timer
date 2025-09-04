 class Timer {
    public int value = 0;

    public int limit;







    public void tick() {
        value++;
        if (value == limit) {
            reset();


        }
    }




    public void setLimit(int limit) {
        this.limit = limit;

    }

    public void setValue(int value) {

        this.value = value;
    }

     public int getValue() {
         return value;
     }

     public void reset() {
        value = 0;


    }


}

public class DigitalTimer{
    public Timer  hours = new Timer();
    public Timer  minutes = new Timer();


    public DigitalTimer(){
        minutes.setLimit(60);
        hours.setLimit(23);
        String hours = String.format("%02d", 0);
        String minutes = String.format("%02d", 0);
        System.out.println(hours + ":" + minutes);

        }

    public DigitalTimer(int hour, int minute) {
        minutes.setLimit(60);
        hours.setLimit(23);

        if (hour<=23 && hour >=0){
            hours.setValue(hour);

        }
        if (minute<=59 && minute >=0){
            minutes.setValue(minute);

        }
    }

    public void set(int hour, int minute) {

        if (hour<=23 && hour >=0){
            hours.setValue(hour);

        }
        if (minute<=59 && minute >=0){
            minutes.setValue(minute);

        }
    }

    public void tick(){
        if(minutes.getValue()==59){
            hours.tick();


        }

        minutes.tick();





    }



    public String toString(){
        String h = String.format("%02d",hours.getValue() );
        String m = String.format("%02d",minutes.getValue() );
        return (h+":"+m);
    }

    public static void main(String[] args) {
        DigitalTimer t1, t2;	 // Create variables that can reference two timers.

        t1 = new DigitalTimer();
        t2 = new DigitalTimer(9, 58);

        // Test the default constructor
        for (int i = 0; i < 5; i++)
        {
            System.out.println(t1);
            t1.tick();
        }

        // Test the other constructor, plus minute wrap-around

        System.out.println("\n\nTest minute wrap-around:");

        for (int i = 0; i < 5; i++)
        {
            System.out.println(t2);
            t2.tick();
        }

        // Test reset, plus hour wrap-around

        System.out.println("\n\nTest hour wrap-around:");
        t1.set(23, 58);

        for (int i = 0; i < 5; i++)
        {
            System.out.println(t1);
            t1.tick();
        }
    }
}






