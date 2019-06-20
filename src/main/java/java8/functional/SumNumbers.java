package java8.functional;

import java.util.List;
import java.util.function.Predicate;
// Use of functional interface
public class SumNumbers{



    public int sum(List<Integer> list, Predicate<Integer> predicate )
    {
        int number =0;

        for (int i = 0; i <= list.size(); i++) {
        if (predicate.test(i))
            number = number + i;
        }
        return number;
    }


}
