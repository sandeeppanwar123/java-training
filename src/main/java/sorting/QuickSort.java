package sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,6,1,4};
        for (int i = 0; i <arr.length ; i++) {


            System.out.println(arr[i]);
        }
    }

    public static int[] qsort(int[] arr, int l, int h)
    {
        int p = part(arr, l, h);
        qsort(arr, l, p-1);
        qsort(arr, p+1, h);


        return arr;
    }

    private static int part(int[] arr, int l, int h) {
        return h-1/2;
    }
}
