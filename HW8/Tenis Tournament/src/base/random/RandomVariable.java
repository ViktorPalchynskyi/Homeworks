package base.random;

import java.util.Random;

public class RandomVariable {





   public static int randomStats (int min , int max){
        Random random = new Random();
        return random.nextInt(min - max) + min;
    }
}
