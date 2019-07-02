package java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample1 {


    public static void main(String[] args) {

        Thread thread = new Thread(() -> { System.out.println("Hello I am in main"+ Thread.currentThread().getName());
        });
thread.start();


//Steam example
        List<String> list = new ArrayList<String>();
        list.add("x");
        list.add("y");
        list.add("z");


         list.stream()
                .map(t -> t.toUpperCase())
                .filter(x -> x.equals("Y"))
                .collect(Collectors.toList())
                 .forEach(t -> System.out.println(t));






    }

}
