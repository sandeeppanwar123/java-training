package java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Calculation {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

      SumNumbers sumNumbers = new SumNumbers();

        System.out.println(sumNumbers.sum(list, (i) -> i%2==0));
        System.out.println(sumNumbers.sum(list, (i) -> i%2!=0));

    }


}
