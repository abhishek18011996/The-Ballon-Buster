package Utility;

import java.util.Random;

/**
 * Created by abhishek on 08-07-2017.
 */
public class RandomInt {
    public static int randomInt(int lower,int upper){
        Random r=new Random();
        int x=r.nextInt(upper-lower);
        return x+lower;
    }


    }

