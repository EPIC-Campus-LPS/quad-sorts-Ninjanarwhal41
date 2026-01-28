import java.util.Arrays;

public class SortingTester
{

    public static void main(String[] args){
        int[] arr = randomArray(100);
        int[] arr2 = randomArray(1000);
        int[] arr3 = randomArray(10000);
        int[] arr4 = randomArray(100000);
        int[] arr5 = randomArray(1000000);

        /*getTime(1, arr);
        getTime(1, arr2);
        getTime(1, arr3);
        getTime(1, arr4);
        getTime(1, arr5);
        */
        getTime(2, arr);
        getTime(2, arr2);
        getTime(2, arr3);
        getTime(2, arr4);
        getTime(2, arr5);
        /*
        getTime(3, arr);
        getTime(3, arr2);
        getTime(3, arr3);
        getTime(3, arr4);
        getTime(3, arr5);
        getTime(4, arr);
        getTime(4, arr2);
        getTime(4, arr3);
        getTime(4, arr4);
        getTime(4, arr5);
        */

    }
    public static int[] randomArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 1000);
        }
        return arr;
    }
    public static void getTime(int q, int[] arr){
        double currentTime = System.currentTimeMillis();
        switch (q){
            case 1:
                System.out.println(Arrays.toString(QuadSort.bubbleSort(arr)));
                break;
            case 2:
                System.out.println(Arrays.toString(QuadSort.selectionSort(arr)));
                break;
            case 3:
                System.out.println(Arrays.toString(QuadSort.insertionSort(arr)));
                break;
            case 4:
                System.out.println(Arrays.toString(QuadSort.mergeSort(arr)));
                break;

        }
        System.out.println((System.currentTimeMillis() - currentTime) + " ms");
    }

}
