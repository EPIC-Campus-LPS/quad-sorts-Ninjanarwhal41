import java.util.Arrays;

public class SortingTester
{

    public static void main(String[] args){
        int[] arr = randomArray(100);
        int[] arr2 = randomArray(1000);
        int[] arr3 = randomArray(10000);
        int[] arr4 = randomArray(100000);
        int[] arr5 = randomArray(1000000);

        getTime(1, arr);

    }
    public static boolean sorted(int[] arr){
        for (int i = 0; i < arr.length -1; i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
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
                System.out.println(sorted(QuadSort.bubbleSort(arr)));
                break;
            case 2:
                System.out.println(sorted(QuadSort.selectionSort(arr)));
                break;
            case 3:
                System.out.println(sorted(QuadSort.insertionSort(arr)));
                break;
            case 4:
                System.out.println(sorted(QuadSort.mergeSort(arr, 0, arr.length-1)));
                break;

        }
        System.out.println((System.currentTimeMillis() - currentTime) + " ms");
    }

}
