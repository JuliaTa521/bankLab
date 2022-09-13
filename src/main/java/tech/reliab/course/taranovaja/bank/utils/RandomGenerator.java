package tech.reliab.course.taranovaja.bank.utils;

import java.util.Random;

public class RandomGenerator {

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static int generateInt(int min, int max){
        return new Random().nextInt(max-min+1)+min;
    }

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static float generateFloat(float min, float max){
        return new Random().nextFloat(max-min+1)+min;
    }

    public static float generateRateUseRating(int min, int max, int rating){
        float random=generateFloat(min, max);
        return (float)(random*(1-rating*0.5));
    }

    public static int generateCreditRating(int mountIncome){
        return (int) Math.round(Math.ceil(mountIncome/1000))*100;
    }

}
