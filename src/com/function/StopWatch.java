package  com.function;

public class StopWatch {


    public static void main(String[] args)
    {
        System.out.println("Print any character and press enter to start stopwatch");
        char startCh = Utility.getuserChar();
        long start = System.currentTimeMillis();
        System.out.println("Enter any character and press enter to stop stopwatch");
        char stopCh = Utility.getuserChar();
        long stop = System.currentTimeMillis();
        float timeElapsed = (float) (stop - start)/1000;
        System.out.println("Time =" + timeElapsed + " Seconds");

    }
}
