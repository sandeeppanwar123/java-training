package org.collection;

import java.util.Vector;
//Vector is similar to ArrayList just it is synchronized.
public class VectorExample {

        public static void main (String[]args){

        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.forEach(integer -> {
            System.out.println(integer);
        });

    }


    }


