package data.structure;

import java.util.*;

public class LinkedListExample
{


    public static void main(String[] args) {

List list = new ArrayList();

        String str = "abcadaduwaiaoakakajahhhhaaaa";

        Integer x=  34;


int t = 34;



      int count=0;
      for (int i=0; i<str.length();i++)
      {
          if(str.charAt(i) == 'a')
          {
              count++;
          }
      }
        System.out.println(count);





        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");

        Set set = new HashSet();

        Iterator itr = linkedList.listIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
