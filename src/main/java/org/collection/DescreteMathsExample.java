package org.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;

public class DescreteMathsExample {

    public static void main(String[] args) {
        Set s1 =  new HashSet();
        s1.addAll(Arrays.asList(new Integer[] {1,3,5,6,3,7,8,4,0}));

        Set s2 = new HashSet();
        s2.addAll(Arrays.asList(new Integer[] {2,9,5,3,}));

        //Union

        Set union = new HashSet();
        union.addAll(s1);
        union.addAll(s2);

        System.out.println("Union elements: " + union);


        //Subtracted

        Set subtract = new HashSet();

        subtract.addAll(s1);
        subtract.removeAll(s2);
        System.out.println("Subtracted elements: " + subtract);

        //Common
        union.retainAll(subtract);
        System.out.println("Common object" + union);








    }
}
