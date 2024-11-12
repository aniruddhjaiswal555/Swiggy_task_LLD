package util;
import java.util.*;
public class Dice {
     private static final Random value = new Random();
     public Dice(){}
     public static int roll()
     {
        return value.nextInt(6) + 1;
     }
}
