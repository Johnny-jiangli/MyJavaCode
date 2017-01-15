package Sartr;

/**
 * Created by jiangli on 2017/1/14.
 */

public class DataOnlyTest {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java E04_Velocity distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance / time);// Change the next line if you want to use a different     // unit for 'distance'     System.out.println(" m/s");   } }
    }}