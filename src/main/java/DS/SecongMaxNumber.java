package DS;

import java.util.Arrays;

public class SecongMaxNumber {

    public static void main(String[] args) {
        int[] input1=  {1,2,3,4};
        int maxValue = 0;
        int secondLast =0;

        for (int number:input1
             ) {
            if(number > maxValue) {
                secondLast = maxValue;
                maxValue = number;
            }
        }
        System.out.println(secondLast);
    }
}
