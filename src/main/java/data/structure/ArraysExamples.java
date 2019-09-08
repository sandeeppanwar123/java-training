package data.structure;

import java.util.*;

public class ArraysExamples
{
int[] numArr = {1,2,3,4,5};

    public static void main(String[] args) {
        ArraysExamples arraysExamples = new ArraysExamples();
        List list = new ArrayList(Arrays.asList(arraysExamples.numArr));


        Collections.sort(list);
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }





}
