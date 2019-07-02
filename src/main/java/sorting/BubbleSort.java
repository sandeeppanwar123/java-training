package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {


    public static void main(String[] args) {
        int[] mixedArr = new int[] {4,2,5,2,0,1,7,8,4,3,7};
        for (int i=0;i<mixedArr.length;i++)
        {

            System.out.print(" "+mixedArr[i]);
        }
        System.out.println();
      int[] sortedArray=  getSortedArray(mixedArr);

      for (int i=0;i<sortedArray.length;i++)
      {
          //System.out.print(" "+mixedArr[i]);
          System.out.print(" "+sortedArray[i]);
      }

    }

    private static int[] getSortedArray(int[] mixedArr) {

        for(int i=0; i< mixedArr.length -1 ;i++)
        {


            for (int j=0;j<mixedArr.length -i -1 ; j++)
            {
                if (mixedArr[j] > mixedArr[j+1]) {
                    int temp = mixedArr[j];
                    mixedArr[j] =mixedArr[j+1];
                    mixedArr[j+1] = temp;
                }

            }


            }





        return mixedArr;
    }


}
