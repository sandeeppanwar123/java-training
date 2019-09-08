package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5,2,6,8,2,3,1,5,8};
        arr = sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    public static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index = i;
            for(int j = i+1; j < arr.length;j++) {
                if (arr[index] > arr[j])
                    index = j;
            }
                int temp = arr[index];
                 arr[index] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }
}
