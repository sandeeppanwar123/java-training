package data.structure;

import java.util.*;

/*

Q.
given
int numArrInt[] = {1,2,5,4,3};
List list = Arrays.asList(numArrInt);
sout(list.size());

What would be the output
a) 5
b) 1
c) 4
d) 0


 */

public class ArraysVsArrayListExamples
{
    int numArrInt[] = {1,2,5,4,3}; //prim type
    Integer numInteger[] = {5,1,4,3,2}; //Object Type


    public static void main(String[] args) {
        ArraysVsArrayListExamples arraysVsArrayListExamples = new ArraysVsArrayListExamples();

        List listInteger = Arrays.asList(arraysVsArrayListExamples.numInteger); //Not Converted int so Took [] as object
        List listInt = Arrays.asList(arraysVsArrayListExamples.numArrInt); //Already Object type so okay to convert.
        System.out.println("size: " +listInt.size());
        System.out.println("size Integer: " +listInteger.size());
        Collections.sort(listInteger);
        Collections.sort(listInt);
        Iterator itrInt = listInt.iterator();
        while (itrInt.hasNext())
        {
            System.out.println(itrInt.next());
        }

        System.out.println("----------");
        listInteger.stream().forEach(
                a -> System.out.println(a)

        );
    }
}
